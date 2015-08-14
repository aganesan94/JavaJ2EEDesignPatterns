package org.test.designpatterns.creational;

import org.designpatterns.structural.adapter.Adapter;
import org.designpatterns.structural.adapter.player.Command;
import org.junit.Test;

/*
 * Project Name: JavaDesignPatterns
 * File Name: AdapterTest.java
 * Author: AGanesan
 */
public class AdapterTest {

	private static final String FROZEN_MOV = "Frozen.mov";
	private static final String MOZART_WAV = "Mozart.wav";
	private static final String XMEN_DIVX = "xmen.divx";

	@Test
	public void adapter() {

		// The client need not know which person is making the call.

		Adapter.execute(MOZART_WAV, Command.PLAY);
		Adapter.execute(MOZART_WAV, Command.PAUSE);
		Adapter.execute(MOZART_WAV, Command.STOP);
		Adapter.execute(MOZART_WAV, Command.REWIND);
		Adapter.execute(MOZART_WAV, Command.PLAY);

		Adapter.execute(FROZEN_MOV, Command.PLAY);
		Adapter.execute(FROZEN_MOV, Command.PAUSE);
		Adapter.execute(FROZEN_MOV, Command.STOP);
		Adapter.execute(FROZEN_MOV, Command.REWIND);
		Adapter.execute(FROZEN_MOV, Command.PLAY);

		Adapter.execute(XMEN_DIVX, Command.PLAY);
		Adapter.execute(XMEN_DIVX, Command.PAUSE);
		Adapter.execute(XMEN_DIVX, Command.STOP);
		Adapter.execute(XMEN_DIVX, Command.REWIND);
		Adapter.execute(XMEN_DIVX, Command.PLAY);

	}

}
