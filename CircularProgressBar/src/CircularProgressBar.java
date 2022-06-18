import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;



public class CircularProgressBar extends JPanel  {
	private int percentage;              				 // Current percentage
	private final double percentageToRealConstant=3.6;   
	private final int maxPercentage=100;				// Max percentage this circular progress bar can take
	private int percentageChange;						// Percentage change in time intervals
	private int radius;									// Radius of circular progress bar		
	private Font percentageWritingFont;					// Font of the writing which is in circular progress bar
	private Color circularProgressBarColor;				// Color of circular progress bar
	private Timer timer;								// Timer for animation of circular progress bar

	public CircularProgressBar(int delayms) {
		this.percentage=0;
		this.radius=100;
		this.percentageChange=10;
		this.percentageWritingFont=new Font(Font.SERIF, Font.PLAIN,  14);
		this.circularProgressBarColor=Color.green;
		this.setPreferredSize(new Dimension(radius+20, radius+20));
		this.setOpaque(false);
		this.timer=new Timer(delayms, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(percentage>=maxPercentage) {
					percentage=0;
					
				}
				else {
					percentage+=percentageChange;
				}
				repaint();
				
			}
		});
	
	}
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
	    g2.setStroke(new BasicStroke(13.0f));
		g2.setColor(Color.WHITE);
		
		g2.drawArc(10, 10, radius, radius, 0, 360);
		
		g2.setColor(circularProgressBarColor);
		g2.drawArc(10,10,radius,radius,180,(int) (this.percentageToRealConstant*this.percentage*-1));
		
		drawCenteredString(g2, percentage+"%", new Rectangle(10,10 ,radius,radius),this.percentageWritingFont);

	}
	
	public void drawCenteredString(Graphics2D g2, String text, Rectangle rect, Font font) {
	    // Get the FontMetrics
	    FontMetrics metrics = g2.getFontMetrics(font);
	    // Determine the X coordinate for the text
	    int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
	    // Determine the Y coordinate for the text (note we add the ascent, as in java 2d 0 is top of the screen)
	    int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
	    // Set the font
	    g2.setFont(font);
	    // Draw the String
	    g2.drawString(text, x, y);
	}
	public void changePercentageChange(int newChange) {
		this.percentageChange=newChange;
		repaint();
		
	}
	public void changeTimerDelay(int newDelayms) {
		this.timer.setDelay(newDelayms);
		this.timer.setInitialDelay(newDelayms);
	}
	public void startAnimation() 
	 /* This function is used for starting
	 * animation of circular progress bar
	 */
	{
		this.timer.start();
	}
	public void stopAnimation() 
	/* This function is used for stopping
	 * animation of circular progress bar
	 */
	{
		this.timer.stop();
	}
	
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
		repaint();
	}

	public int getPercentageChange() {
		return percentageChange;
	}
	public void setPercentageChange(int percentageChange) {
		this.percentageChange = percentageChange;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
		this.setPreferredSize(new Dimension(radius+20, radius+20));
		repaint();
	}
	public double getPercentageToRealConstant() {
		return percentageToRealConstant;
	}
	public int getMaxPercentage() {
		return maxPercentage;
	}
	public Font getPercentageWritingFont() {
		return percentageWritingFont;
	}
	public void setPercentageWritingFont(Font percentageWritingFont) {
		this.percentageWritingFont = percentageWritingFont;
		repaint();
	}
	public Color getCircularProgressBarColor() {
		return circularProgressBarColor;
	}
	public void setCircularProgressBarColor(Color circularProgressBarColor) {
		this.circularProgressBarColor = circularProgressBarColor;
		repaint();
	}
	
	
	
	
	

}
