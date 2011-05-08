package org.antitech.dripper.ui

/**
 * User: aaron
 * Date: 5/8/11
 * Time: 2:00 PM
 */
import javax.swing.tree.TreeNode
import swing.{FlowPanel, TreeModel, Frame, Tree}

case class Node[A](value: A, children: Node[A]*)

class ContactList extends Frame {
  title = "Contact List"
  lazy val menuItems = Node("Contacts")

  val myTree = new Tree[TreeNode[String]] {
    treeData = TreeModel(menuItems)(_.children)
    renderer = Tree.Renderer(_.value)
  }

  contents = new FlowPanel() {
    contents += myTree
  }
  visible = true
}