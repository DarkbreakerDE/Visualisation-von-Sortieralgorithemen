package Visualisierung;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Panel extends JPanel {
	
	public Panel() {
		super.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		//super.setBounds(0, 0, 500, 20);
		super.setMaximumSize(new Dimension(700,305));
		super.setMinimumSize(new Dimension(300,305));
		super.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));
		//super.setAlignmentX(30);
		//super.setAlignmentY(30);
		super.add(new Rechteck(200));
		super.add(Box.createRigidArea(new Dimension(5,10)));
		super.add(new Rechteck(50));
		super.add(Box.createRigidArea(new Dimension(5,10)));
		super.setBackground(new Color(Consts.BACKGROUNDCOLOR.getColor()));
		super.add(new Rechteck(100));
		//TODO Minimum size 
	}

}
