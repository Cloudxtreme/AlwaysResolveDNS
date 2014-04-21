package initializers

import io.netty.channel.ChannelInitializer
import io.netty.handler.codec.string.StringEncoder
import io.netty.handler.codec.string.StringDecoder
import io.netty.channel.epoll.EpollSocketChannel

import org.slf4j.LoggerFactory
import scalaframes.TCPDnsMessageDecoder
import server.dns.TCPDnsHandler

class TCPDnsServerInitializer extends ChannelInitializer[EpollSocketChannel] {

  val logger = LoggerFactory.getLogger("app")

  def initChannel(ch: EpollSocketChannel): Unit = {
      logger.debug("Initializing TCP server.........")
      val pipeline = ch.pipeline()

      val frameDecoder = new TCPDnsMessageDecoder
      pipeline.addLast("framer", frameDecoder)
      //pipeline.addLast("decoder", new StringDecoder)
      //pipeline.addLast("encoder", new StringEncoder)
      pipeline.addLast("dns_handler",new TCPDnsHandler)
      pipeline
  }

}