package com.siqchat.android.xmpp;

import com.siqchat.android.entities.Account;

public interface OnMessageAcknowledged {
	public void onMessageAcknowledged(Account account, String id);
}
