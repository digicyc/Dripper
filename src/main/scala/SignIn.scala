package org.antitech.dripper

/*
* Popup window to sign into an actual Jabber Server.
*/

import scala.swing._
import event._
import scala.swing.BoxPanel._
import java.awt.Insets


object SignIn extends SimpleSwingApplication {
  lazy val ui = new BoxPanel {
    val shouldFill = true

    val hostLabel = new Label {
      text = "HostName: "
    }
    layout(hostLabel)
    
    // HostName Text Field
    def hostField = new TextField {
      text = ""
      columns = 5
      horizontalAlignment = Alignment.Right
    }
    layout(hostField)

    // Username Text Field
    def userField = new TextField {
      text = ""
      columns = 5
      horizontalAlignment = Alignment.Right
    }
    layout(userField)

    val loginButton = new Button("Login")
    layout(loginButton)

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