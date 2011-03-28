package org.antitech.dripper

/*
* Popup window to sign into an actual Jabber Server.
*/

import scala.swing._
import event._


object SignIn extends SimpleSwingApplication {
  lazy val ui = new BoxPanel(Orientation.Vertical) {
    val hostLayout = new BoxPanel(Orientation.Horizontal)
    val userLayout = new BoxPanel(Orientation.Horizontal)
    val passLayout = new BoxPanel(Orientation.Horizontal)

    val hostLabel = new Label {
      text = "HostName: "
    }
    hostLayout.contents += hostLabel

    // HostName Text Field
    val hostField = new TextField {
      text = ""
      columns = 2
      horizontalAlignment = Alignment.Right
    }
    hostLayout.contents += hostField

    val userLabel = new Label {
      text = "UserName: "
    }
    userLayout.contents += userLabel

    // Username Text Field
    val userField = new TextField {
      text = ""
      columns = 5
      horizontalAlignment = Alignment.Right
    }
    userLayout.contents += userField

    val passLabel = new Label {
      text = "Password: "
    }
    passLayout.contents += passLabel

    val passField = new TextField {
      text = ""
      columns = 5
      horizontalAlignment = Alignment.Right
    }
    passLayout.contents += passField
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
      border = Swing.EmptyBorder(10, 10, 10, 10)
    }
    border = Swing.EmptyBorder(5, 5, 5, 5)
    contents += hostLayout
    contents += userLayout
    contents += passLayout
    contents += buttonLayout

    def processButton(text: String) {
      if( text == "Login" ) {
        println("Login to Jabber")
        println("Host: " + hostField.text)
        println("User: " + userField.text)
      }
      else if( text == "Cancel" ) {
        println("Cancel and Close Down")
        System.exit(0)
      }
    }
  }

  def top = new MainFrame {
    title = "Dripper"
    contents = ui
  }
}