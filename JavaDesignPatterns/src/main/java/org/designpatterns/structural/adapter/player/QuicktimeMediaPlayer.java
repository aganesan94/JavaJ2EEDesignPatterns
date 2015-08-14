package org.designpatterns.structural.adapter.player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: QuicktimeMediaPlayer.java
 * Author: AGanesan
 */
public class QuicktimeMediaPlayer implements IMediaPlayer {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void play() {
		logger.info("The video is being played in Quicktime Media Player");
	}

	public void stop() {
		logger.info("Stopping Quicktime Media Player");
	}

	public void pause() {
		logger.info("The video is being paused in Quick time Media Player");
	}

	public void rewind() {
		logger.info("Quicktime Media Player rewind.");
	}

	public void forward() {
		logger.info("Quicktime Media Player forward.");
	}

}
