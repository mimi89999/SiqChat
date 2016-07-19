package com.siqchat.android.xmpp;

import com.siqchat.android.entities.Contact;

public interface OnContactStatusChanged {
	public void onContactStatusChanged(final Contact contact, final boolean online);
}
