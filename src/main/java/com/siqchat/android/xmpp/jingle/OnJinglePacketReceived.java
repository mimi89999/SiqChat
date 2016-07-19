package com.siqchat.android.xmpp.jingle;

import com.siqchat.android.entities.Account;
import com.siqchat.android.xmpp.PacketReceived;
import com.siqchat.android.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	void onJinglePacketReceived(Account account, JinglePacket packet);
}
