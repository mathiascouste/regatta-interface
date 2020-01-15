package fr.unice.polytech.si3.qgl.regatta.cockpit;

import java.util.List;

public interface ICockpit {
	public void initGame(String game);
	public String nextRound(String round);
	public List<String> getLogs();
}
