package org.antitech.dripper

/*
* Popup window to sign into an actual Jabber Server.
*/

import scala.swing._
import event._


object SignIn extends SimpleSwingApplication {
  lazy val ui = new BoxPanel(Orientation.Vertical) {
    val shouldFill = true

    val hostLabel = new Label {
      text = "HostName: "
    }
    contents += hostLabel
    
    // HostName Text Field
    def hostField = new TextField {
      text = ""
      columns = 5
      horizontalAlignment = Alignment.Right
    }
    contents += hostField

    val userLabel = new Label {
      text = "UserName: "
    }
    contents += userLabel

    // Username Text Field
    def userField = new TextField {
      text = ""
      columns = 5
      horizontalAlignment = Alignment.Right
    }
    contents += userField

    val loginButton = new Button("Login")
    contents += loginButton

    listenTo(loginButton)
    reactions += {
      case ButtonClicked(loginButton) =>
        // Authenticate with XMPP Server
        
    }
  }

  def top = new MainFrame {
    title = "Dripper"
    contents = ui
  }
}