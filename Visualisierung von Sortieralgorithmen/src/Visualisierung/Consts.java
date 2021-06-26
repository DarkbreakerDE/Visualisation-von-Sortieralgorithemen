package Visualisierung;

public enum Consts {
	BACKGROUNDCOLOR(0x444444);
	private int i;
	private Consts(int i) {
		this.i = i;
	}
	public int getColor() {
		return i;
	}
	
}
