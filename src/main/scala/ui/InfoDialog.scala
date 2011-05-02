/**
 * Created by IntelliJ IDEA.
 * User: aaron
 * Date: 5/1/11
 * Time: 12:31 AM
 *
 * Parent Dialog Box.
 */
import javax.swing._
import org.antitech.dripper.utils.SwingUtil._

class InfoDialog(val frameTitle: String, val insideText: String) extends JDialog {
  val body = new JTextPane()
  swingLater {
    setSize(400, 400)
    body.setContentType("text/html")
    body.setEditable(false)
    body.setText(insideText)
    add(body)
    setTitle(frameTitle)
    setModal(true)
    pack
    setVisible(true)
  }
}