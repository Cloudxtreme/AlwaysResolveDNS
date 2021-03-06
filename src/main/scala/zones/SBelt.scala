/**
 * Copyright 2013-2015, AlwaysResolve Project (alwaysresolve.org), MOYD.CO LTD
 * This file incorporates work covered by the following copyright and permission notice:
 *
 * Copyright 2012 silenteh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package zones
import scala.collection.immutable.List
import java.io.File
import configs.ConfigService
//import com.codahale.jerkson.Json._
import org.slf4j.LoggerFactory
   
object SBelt {
  
  val logger = LoggerFactory.getLogger("app")
  
  //lazy val rootServers = listOfServer
  
  /*private def listOfServer(): List[Zone] = {
      val servers = List.empty[Zone]
      val file = ConfigService.config.getString("rootservers")
      val lines = io.Source.fromFile(file).getLines.toList	  

	  def loop(acc: List[Zone], lines: List[String]): List[Zone] = {
    	  if(lines.length == 0)
    	    acc
    	   else
    	    loop(parse[Zone](lines.head) :: acc, lines.tail)
	  }
	  loop(servers,lines)	  
	  
  }*/
  
}