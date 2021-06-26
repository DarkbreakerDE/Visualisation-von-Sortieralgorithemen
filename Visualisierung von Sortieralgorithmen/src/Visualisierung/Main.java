package Visualisierung;
import java.awt.*;
import javax.swing.*;



public class Main {

	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon("Logo JHG.png");
		
		JFrame f = new JFrame("Visualisierung von Sortieralgorithemen");
		f.setBackground(Color.yellow); //TODO Farbe 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(10,10, 1000, 600);
		f.setIconImage(icon.getImage());
		f.setLayout(new BorderLayout());
		
		
		//JPanel jp = new JPanel();
		//jp.setBackground(Color.GRAY);
		//jp.setPreferredSize(new Dimension(150,150));
		
		//f.add(new JLabel("HAllo"));
		//f.add(jp,BorderLayout.WEST);
		Panel p = new Panel();
		p.setVisible(true);
		
		Panel p1 = new Panel();
		p1.setVisible(true);//Badabumbadabasch
		
		Panel p2 = new Panel();
		p2.setVisible(true);
		
		SteuerungPanel stp = new SteuerungPanel();
		stp.setVisible(true);
		f.add(p, BorderLayout.CENTER);
		f.add(p1, BorderLayout.PAGE_END);
		f.add(stp, BorderLayout.LINE_END);
		//SteuerungPanel sp = new SteuerungPanel();
		//f.add(new JLabel(new ImageIcon("Green Balken.png")));
		f.setVisible(true);
	}

}
