package Visualisierung;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SteuerungPanel extends JPanel implements ActionListener{
	Panel p;
	public SteuerungPanel() {
		super.setBackground(Consts.BACKGROUNDCOLOR.getColor());
		super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		super.setBorder(new EmptyBorder(new Insets(30, 20, 30, 30)));

		//super.setSize(new Dimension(200, 300));
		
		p = new Panel();
		p.setVisible(true);
		
		JLabel l = new JLabel("Sortieralgorithmus");
		l.setVisible(true);
		this.add(l);
		
		JLabel l2 = new JLabel("Auswählen:");
		l2.setVisible(true);
		this.add(l2);
		
		this.add(Box.createRigidArea(new Dimension(20,20)));
		
		JButton s1 = new JButton();
		s1.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));
		s1.setText("Selection Sort");
		s1.setMinimumSize(new Dimension(200,200));
		s1.addActionListener(this);
		this.add(s1);
		
		this.add(Box.createRigidArea(new Dimension(10,10)));
		
		JButton s2 = new JButton();
		s2.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));
		s2.setText("Insertion Sort ");
		s2.setMinimumSize(new Dimension(50,50));
		s2.addActionListener(this);
		this.add(s2);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
			case "Insertion Sort ":
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
				System.out.println("Button S1");
				break;
			case "Selection Sort":
				System.out.println("Selectionsort");
				p.Selectionsort();
				break;
		}
	}
	
	public Panel getPanel() {
		return p.getSelf();
	}
	
}

