package com.siqchat.android.xmpp.jingle.stanzas;

import com.siqchat.android.xml.Element;

public class Reason extends Element {
	private Reason(String name) {
		super(name);
	}

	public Reason() {
		super("reason");
	}
}
