package org.antitech.dripper.ui

/**
 * Lets populate the Contact List(Roster) with contacts.
 */
import javax.swing.tree.TreeNode
import swing._
import event.{TreePathSelected, TreeNodeSelected}
import org.antitech.dripper.xmpp.XMPPSession


case class Node[A](val nVal: A, val children: Node[A]*) {
  override def toString() = nVal.toString
}

class ContactList(val session: XMPPSession) extends Frame {
  title = "Contact List"
  lazy val dataTrees =
    Node("Contacts",
      Node("Buddies",
        Node("John")),
      Node("CoWorkers",
        Node("Jane")))

  val myTree = new Tree[Node[String]] {
    treeData = TreeModel(dataTrees)(_.children)
    selection.mode = Tree.SelectionMode.Contiguous
    //renderer = Tree.Renderer(_.nVal)
  }

  listenTo(myTree)
  reactions += {
    case TreePathSelected(_, _, _, buddyNode, _) =>
      buddyNode map (_.last)
    case _ => println("none")
  }
}