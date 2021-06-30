package Visualisierung;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Panel extends JPanel {
	private Rechteck[] listeAlt;
	private Rechteck[] listeNeu;
	private int anzahlElemente;
	private int delay;
	
	public Panel() {
		super.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		super.setBorder(new EmptyBorder(new Insets(30, 30, 30, 30)));
		super.setBackground(Consts.BACKGROUNDCOLOR.getColor());
		//super.setMinimumSize(new Dimension(300,600));
		super.setVisible(true);
		
		anzahlElemente = 50;
		listeAlt = new Rechteck[anzahlElemente];
		listeNeu = new Rechteck[anzahlElemente];
		delay = 1000;
		
		listeErstellen();
		draw();
		
		//super.setAlignmentX(30);
		//super.setAlignmentY(30);
		//super.setBounds(0, 0, 500, 20);
		//super.setMaximumSize(new Dimension(700,305));
		//super.setMinimumSize(new Dimension(300,305));
		
		/*super.add(new Rechteck(200));
		super.add(Box.createRigidArea(new Dimension(5,10)));
		super.add(new Rechteck(50));
		super.add(Box.createRigidArea(new Dimension(5,10)));
		super.add(new Rechteck(100));
		*/
		}
	
	public void listeErstellen() {
		for (int i = 1; i<= anzahlElemente; i++) {
			listeAlt[i-1] = new Rechteck(i*5);
		}
		listeNeu = listeAlt;
		Random rand = new Random();
		for (int i = 0; i < anzahlElemente; i++) {
			int randomIndexToSwap = rand.nextInt(anzahlElemente);
			Rechteck temp = listeNeu[randomIndexToSwap];
			listeNeu[randomIndexToSwap] = listeNeu[i];
			listeNeu[i] = temp;
		}
	}
	
	public void draw() {
		delete();
		for (int i = 0; i < anzahlElemente; i++) {
			super.add(listeNeu[i]);
			super.add(Box.createRigidArea(new Dimension(5,0)));
		}
		super.revalidate();
	}
	
	private void delete() {
		for (int i = 0; i < anzahlElemente; i++) {
			super.remove(listeAlt[i]);
		}
		listeAlt = listeNeu;
	}
	
	public Panel getSelf() {
		return this;
	}
	
	private void delay() {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}
