package Visualisierung;

import java.awt.Color;

public enum Consts {
	BACKGROUNDCOLOR(0xA8a8b8); //0x53575B 0x95959b
	private int i;
	private Consts(int i) {
		this.i = i;
	}
	public Color getColor() {
		return new Color(i);
	}
	
}
