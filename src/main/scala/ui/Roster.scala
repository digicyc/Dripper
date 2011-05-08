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

  val contactList = new GridPanel(1, 0) {
    contents += new ScrollPane {
      contents = new ContactList()
      /*contents = new Component {
        val root = new DefaultMutableTreeNode("Roster")
        override lazy val peer = new JTree(new DefaultTreeModel(root)) {
          /*addTreeSelectionListener(new TreeSelectionListener {
            def valueChanged(e: TreeSelectionEvent) {
              //...
            }
          })
          addMouseListener(new java.awt.event.MouseAdapter {
            override def mousePressed(e: MouseEvent) {
              //...
            }

            override def mouseReleased(e: MouseEvent) {
              //...
            }
          })*/
        }
      }*/
      visible = true
    }
  }
  
  contents = contactList
  resizable = true
  peer.setLocationRelativeTo(null)
  pack
  visible = true
}
