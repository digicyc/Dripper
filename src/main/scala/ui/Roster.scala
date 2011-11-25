package org.antitech.dripper.ui

/*
* Roster GUI listing Buddy Objects.
*/

import scala.swing._
import event._
import javax.swing.JTree
import java.awt.Dimension
import javax.swing.event.{TreeSelectionEvent, TreeSelectionListener}
import javax.swing.tree.{DefaultMutableTreeNode, DefaultTreeModel}

class Roster extends Frame {
  title = "Dripper"
  // TODO: Save window sizes during window adjustments.
  size = new Dimension(100, 400)

  reactions += {
    case UIElementResized(_) =>
      println(size.toString)
    case WindowClosing(_) => System.exit(0)
  }

  def buildRoster() {
    this.visible = true
  }

  val rosterList = new GridPanel(1, 0) {
    contents += new ScrollPane {
      //val contactList = new ContactList()
      //contents = contactList.myTree

      visible = true
    }
  }
  
  contents = rosterList
  resizable = true
  peer.setLocationRelativeTo(null)
  pack
  visible = true
}
