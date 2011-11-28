package codeoptimus.dripper.ui

/**
 * ContactList that gets attached to the Roster. Contains JID items.
 */

import scala.swing._
import scala.swing.ListView._
import scala.swing.event._
import us.troutwine.barkety.JID

class ContactList[JID](items: List[JID]) extends FlowPanel {
  val listView = new ListView(items) {
    renderer = Renderer(_.toString)
  }

  listenTo(listView.mouse.clicks)
  reactions += {
    case e: MouseClicked => {
      val selected = listView.selection.items.headOption
      val listItem = selected get
      // Create Chat Window for selected JID
      // TODO: Give PopupMenu
    }
  }
  contents += listView
}