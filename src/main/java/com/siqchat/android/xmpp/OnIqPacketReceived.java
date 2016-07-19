package com.siqchat.android.xmpp;

import com.siqchat.android.entities.Account;
import com.siqchat.android.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	public void onIqPacketReceived(Account account, IqPacket packet);
}
