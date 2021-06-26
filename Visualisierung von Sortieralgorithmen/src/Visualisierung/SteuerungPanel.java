package Visualisierung;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SteuerungPanel extends JPanel implements ActionListener{
	public SteuerungPanel() {
		super.setBackground(new Color(Consts.BACKGROUNDCOLOR.getColor()));
		//super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//super.setMinimumSize(new Dimension(300,300));
		super.setSize(new Dimension(200, 300));
		JButton s1 = new JButton();
		s1.setText("Selcetion Sort");
		s1.setMinimumSize(new Dimension(50,50));
		s1.addActionListener(this);
		this.add(s1);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button S1");
		
	}
	
}

