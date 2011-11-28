package codeoptimus.dripper.utils
/*
 * Idea from Scalide.
 */
import javax.swing._

object SwingUtil {
  // Simple wrapper around a thread.
  def swingLater[R](fn: => R) {
    SwingUtilities.invokeLater {
      new Runnable() {
        def run {
          fn
        }
      }
    }
  }

}
