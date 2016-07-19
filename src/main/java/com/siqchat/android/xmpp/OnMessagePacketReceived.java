package com.siqchat.android.xmpp;

import com.siqchat.android.entities.Account;
import com.siqchat.android.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	public void onMessagePacketReceived(Account account, MessagePacket packet);
}
