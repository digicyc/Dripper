package codeoptimus.dripper.xmpp

/**
 *
 * Handle logins to any amount of Jabber servers.
 * TODO: Always keep in mind multiple Jabber accounts support.
 */
import org.jivesoftware.smack._
import codeoptimus.dripper.ui.Roster
import us.troutwine.barkety.JID

class XMPPSession(val myJID: JID) {
  val conn = new XMPPConnection(myJID.domain)

  def getRoster = conn.getRoster
    

  def loggedIn = {

    true
  }


}