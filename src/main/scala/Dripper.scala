package codeoptimus.dripper
/*
 * Dripper: Jabber client in Scala using Smack.
 */
import org.jivesoftware.smack._
import net.lag.configgy.Configgy
import codeoptimus.dripper.ui.SignIn

object Dripper {

  def getHome = {
    // Setup configuration.
    // TODO: Installer should create folder .dripper and store files there.
    // TODO: Read conf file from user_home/.dripper/conf
    //val fileSep = System.getProperty("file.separator")
    //val confPath = "conf" + fileSep + "dripper.ini"
    //Configgy.configure(confPath)
    //val config = Configgy.config

    // TODO: Allow multiple connections.
    //val serverAddr = config("server.address")
    //val serverPort = config("server.port")
    //val xmppConfig = new ConnectionConfiguration(serverAddr, serverPort.toInt)*/
  }

  def main(args: Array[String]): Unit = {
    new SignIn
  }
}
