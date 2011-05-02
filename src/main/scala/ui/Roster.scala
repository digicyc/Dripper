package org.antitech.dripper.ui
/*
 * Roster GUI listing Buddy Objects.
 */

import scala.swing._
import event._
import java.awt.Dimension

class Roster extends Frame {
  title = "Dripper"
  // TODO: Save window sizes during window adjustments.
  size = new Dimension(100, 400)
  resizable = true
  peer.setLocationRelativeTo(null)

  reactions += {
    case UIElementResized(_) =>
      println(size.toString)
    case WindowClosing(_) => System.exit(0)
  }

  def buildRoster() {
    this.visible = true
  }
}
