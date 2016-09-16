package com.sia.model.impl;

import java.io.PrintStream;

import com.sia.model.Quest;

public class SlayDragonQuest implements Quest{

	private PrintStream stream;
	
	public SlayDragonQuest (PrintStream stream){
		this.stream = stream;
	}
	@Override
	public void embark() {		
		stream.println("Embarking on Quest to slay a dragon");
	}
	
}
