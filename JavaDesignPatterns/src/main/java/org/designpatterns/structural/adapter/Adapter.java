package org.designpatterns.structural.adapter;

import org.designpatterns.structural.adapter.player.Command;
import org.designpatterns.structural.adapter.player.IMediaPlayer;
import org.designpatterns.structural.adapter.player.QuicktimeMediaPlayer;
import org.designpatterns.structural.adapter.player.VLCMediaPlayer;
import org.designpatterns.structural.adapter.player.WindowsMediaPlayer;

/*
 * Project Name: JavaDesignPatterns
 * File Name: Adapter.java
 * Author: AGanesan
 */
public class Adapter {

	public static void execute(String fileName, Command command) {

		IMediaPlayer mediaPlayer = null;

		if (fileName.endsWith(".mov")) {
			mediaPlayer = new QuicktimeMediaPlayer();
		} else if (fileName.endsWith(".wav")) {
			mediaPlayer = new WindowsMediaPlayer();
		} else {
			mediaPlayer = new VLCMediaPlayer();
		}

		switch (command) {
		case PLAY:
			mediaPlayer.play();
			break;
		case STOP:
			mediaPlayer.stop();
			break;
		case PAUSE:
			mediaPlayer.pause();
			break;
		case FORWARD:
			mediaPlayer.forward();

		case REWIND:
			mediaPlayer.rewind();
			break;
		};

	}

}
