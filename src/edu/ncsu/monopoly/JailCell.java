package edu.ncsu.monopoly;

public class JailCell extends Cell {
	public static int BAIL = 50;
	
	public JailCell() {
		setName("Jail");
	}
	
	public boolean playAction(String msg) {
		return true;
	}
}
