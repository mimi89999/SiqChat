package com.siqchat.android.xmpp.jingle;

import com.siqchat.android.entities.DownloadableFile;

public interface OnFileTransmissionStatusChanged {
	void onFileTransmitted(DownloadableFile file);

	void onFileTransferAborted();
}
