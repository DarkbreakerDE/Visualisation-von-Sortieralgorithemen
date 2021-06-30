package Visualisierung;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Panel extends JPanel implements ActionListener {
	private Rechteck[] listeAlt;
	private Rechteck[] listeNeu;
	private int anzahlElemente;
	private int delay;
	private Component[] empty;
	private int zahl1;
	private int zahl2;
	private Timer timer;
	private String selectedsort;
	
	public Panel() {
		super.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		super.setBorder(new EmptyBorder(new Insets(30, 30, 30, 30)));
		//super.setBackground(Consts.BACKGROUNDCOLOR.getColor());
		super.setBackground(Color.black);
		super.setVisible(true);
		
		timer = new Timer(10, this);
		anzahlElemente = 50;
		listeAlt = new Rechteck[anzahlElemente];
		listeNeu = new Rechteck[anzahlElemente];
		empty = new Component[anzahlElemente];
		delay = 100;
		
		listeErstellen();
		draw();
		
		}
	
	public void listeErstellen() {
		for (int i = 1; i<= anzahlElemente; i++) {
			listeAlt[i-1] = new Rechteck(i*5);
			empty[i-1] = Box.createRigidArea(new Dimension(5,0));
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
			super.add(empty[i]);
		}
		super.revalidate();
		super.repaint();
	}
	
	private void delete() {
		for (int i = 0; i < anzahlElemente; i++) {
			super.remove(listeAlt[i]);
			super.remove(empty[i]);
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
	
	private void selectionsort(int o, int i) {
		listeAlt = listeNeu;
		if (listeAlt[i].getValue() > listeAlt[o].getValue()) {
			Rechteck temp = listeAlt[i];
			listeAlt[i] = listeAlt[o];
			listeAlt[o] = temp;
			listeNeu = listeAlt;
			draw();
		}
	}
	
	public void Selectionsort() {
		zahl1 = 0;
		zahl2 = 0;
		selectedsort = "Selectionsort";
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(selectedsort) {
			case "Selectionsort":
				int[] zahlen = getNumbers();
				//System.out.println(zahlen[0] + " " + zahlen[1]);
				selectionsort(zahlen[0],zahlen[1]);
		}	
	}
	
	private int[] getNumbers() {
		if (zahl2 < anzahlElemente-1) {
			zahl2++;
			int[] a = {zahl1, zahl2};
			return a;
		} else if (zahl1 < anzahlElemente-1) {
			zahl1++;
			zahl2 = 0;
			int[] a = {zahl1, zahl2};
			return a;
		} else {
			timer.stop();
		}
		int[] a = {zahl1, zahl2};
		return a;
		
	}
	
}
