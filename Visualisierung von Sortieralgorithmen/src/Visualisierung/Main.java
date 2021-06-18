package Visualisierung;
import java.awt.Color;

import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("Visualisierung von Sortieralgorithemen");
		f.setBackground(Color.GRAY);
		f.setBounds(10,10, 1000, 600);
		f.setIconImage(null); //TODO
		f.add(new Rechteck(100));
		//f.add(new JLabel(new ImageIcon("C:\\Users\\marvi\\Downloads\\Download (1).png")));
		f.setVisible(true);
	}

}
