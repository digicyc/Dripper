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
    val hostField = new TextField {
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
    val userField = new TextField {
      text = ""
      columns = 5
      horizontalAlignment = Alignment.Left
    }
    contents += userField

    // Buttons
    val loginButton = new Button("Login")
    val cancelButton = new Button("Cancel")

    listenTo(loginButton, cancelButton)
    reactions += {
      case ButtonClicked(buttonClicked) =>
        processButton(buttonClicked.text)
    }

    val buttonLayout = new BoxPanel(Orientation.Horizontal) {
      contents += loginButton
      contents += cancelButton
    }
    contents += buttonLayout

    def processButton(text: String) {
      if( text == "Login" ) {
        println("Login to Jabber")
        println("Host: " + hostField.text)
        println("User: " + userField.text)
      }
      else if( text == "Cancel" ) {
        println("Cancel and Close Down")
      }
    }
  }

  def top = new MainFrame {
    title = "Dripper"
    contents = ui
  }
}