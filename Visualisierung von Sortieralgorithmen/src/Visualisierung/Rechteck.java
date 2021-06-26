package Visualisierung;
import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class Rechteck extends JLabel{
	private int hight;
	private int WIDTH;
	private String PATH_GREEN;
	private String PATH_RED;
	private String aktuellerPfad;

	public Rechteck(int hight) {
		 this.hight = hight;
		 WIDTH= 9;
		 PATH_GREEN = "Green Balken.png";
		 PATH_RED = "RedBalken.png";
		 aktuellerPfad = PATH_GREEN;
		 setIcon();
		 super.setAlignmentY(BOTTOM_ALIGNMENT);
	}
	
	public void setIcon() {
		ImageIcon icon = new ImageIcon(aktuellerPfad); //TODO
		Image image = icon.getImage();
		image = image.getScaledInstance(WIDTH, hight, java.awt.Image.SCALE_SMOOTH);
		icon.setImage(image);
		super.setIcon(icon);
	}
	
	public void setImageGreen() {
		aktuellerPfad = PATH_GREEN;
	}
	
	public void sezImageRed() {
		aktuellerPfad = PATH_RED;
	}
	/*private Image getScaledImage(Image srcImg, int w, int h){
	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2 = resizedImg.createGraphics();

	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    g2.drawImage(srcImg, 0, 0, w, h, null);
	    g2.dispose();

	    return resizedImg;
	
	}
	*/
}
