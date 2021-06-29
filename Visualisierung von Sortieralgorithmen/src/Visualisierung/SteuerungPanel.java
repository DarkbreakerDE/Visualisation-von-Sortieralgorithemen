package Visualisierung;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SteuerungPanel extends JPanel implements ActionListener{
	public SteuerungPanel() {
		super.setBackground(new Color(Consts.BACKGROUNDCOLOR.getColor()));
		super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//super.setLayout(new GridBagLayout());
		super.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));
		//super.setMinimumSize(new Dimension(300,300));
		super.setSize(new Dimension(200, 300));
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
				System.out.println("Button S1");
				break;
			case "Selection Sort":
				System.out.println("Button S2");
				break;
		}
	}
	
}

