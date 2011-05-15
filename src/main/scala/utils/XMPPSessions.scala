package utils

/**
 * Manage all XMPP Sessions.
 *
 */
import org.antitech.dripper.xmpp.XMPPSession

object XMPPSessions {
  private var xmppSessions = List[XMPPSession]()

  def addSession(xmpp: XMPPSession) {
    xmppSessions = xmpp :: xmppSessions
  }
}