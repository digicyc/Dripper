package codeoptimus.dripper.utils

/**
 * Manage all XMPP Sessions.
 *
 */
import codeoptimus.dripper.xmpp.XMPPSession

object XMPPSessions {
  private var xmppSessions = List[XMPPSession]()

  def addSession(xmpp: XMPPSession) {
    xmppSessions = xmpp :: xmppSessions
  }
}