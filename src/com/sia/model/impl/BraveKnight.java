package com.sia.model.impl;

import com.sia.model.Knight;
import com.sia.model.Quest;

public class BraveKnight implements Knight{
	public Quest quest;
	
	public BraveKnight (Quest quest){
		this.quest = quest;
	}
	
	public void embarkQuest(){
		quest.embark();
	}
}
