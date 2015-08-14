package org.designpatterns.structural.adapter.player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: WindowsMediaPlayer.java
 * Author: AGanesan
 */
public class WindowsMediaPlayer implements IMediaPlayer {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void play() {
		logger.info("The video is being played in Windows Media Player");
	}

	public void stop() {
		logger.info("Stopping Windows Media Player");
	}

	public void pause() {
		logger.info("The video is being paused in Windows Media Player");
	}

	public void rewind() {
		logger.info("Windows Media Player rewind");
	}

	public void forward() {
		logger.info("Windows Media Player forward");
	}

}
