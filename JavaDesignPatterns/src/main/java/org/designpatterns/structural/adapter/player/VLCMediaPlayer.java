package org.designpatterns.structural.adapter.player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Project Name: JavaDesignPatterns
 * File Name: VLCMediaPlayer.java
 * Author: AGanesan
 */
public class VLCMediaPlayer implements IMediaPlayer {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void play() {
		logger.info("The video is being played in VLC Media Player");
	}

	public void stop() {
		logger.info("Stopping VLC Media Player");
	}

	public void pause() {
		logger.info("The video is being paused in VLC Media Player");
	}

	public void rewind() {
		logger.info("VLC Media Player rewind.");
	}

	public void forward() {
		logger.info("VLC Media Player forward.");
	}
}
