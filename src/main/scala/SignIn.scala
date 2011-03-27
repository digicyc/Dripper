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
      horizontalAlignment = Alignment.Left
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
      horizontalAlignment = Alignment.Left
    }
    contents += userField

    // BUttons
    val loginButton = new Button("Login")
    val cancelButton = new Button("Cancel")

    listenTo(loginButton)
    listenTo(cancelButton)
    reactions += {
      case ButtonClicked(loginButton) =>
        // Authenticate with XMPP Server
    }

    val buttonLayout = new BoxPanel(Orientation.Horizontal) {
      contents += loginButton
      contents += cancelButton
    }
    contents += buttonLayout
  }

  def top = new MainFrame {
    title = "Dripper"
    contents = ui
  }
}