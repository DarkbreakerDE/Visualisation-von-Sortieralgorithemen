package Visualisierung;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class Rechteck extends JLabel{
	private int hight;
	private int WIDTH;
	private String PATH;

	public Rechteck(int hight) {
		 this.hight = hight;
		 WIDTH= 9;
		 PATH = ""; //TODO 
		 setIcon();
	}
	
	public void setIcon() {
		ImageIcon icon = new ImageIcon("C:\\Users\\marvi\\Downloads\\Download (1).png"); //TODO
		Image image = icon.getImage();
		image = image.getScaledInstance(WIDTH, hight, java.awt.Image.SCALE_SMOOTH);
		icon.setImage(image);
		super.setIcon(icon);
	}
	
	private Image getScaledImage(Image srcImg, int w, int h){
	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2 = resizedImg.createGraphics();

	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    g2.drawImage(srcImg, 0, 0, w, h, null);
	    g2.dispose();

	    return resizedImg;
	}
}
