package com.siqchat.android.xmpp;

import com.siqchat.android.entities.Account;
import com.siqchat.android.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
