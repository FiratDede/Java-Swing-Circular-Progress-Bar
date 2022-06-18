import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main {

	public static void main(String[] args) {

		JFrame frame=new JFrame();
		frame.setTitle("Circular Progress Bar Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CircularProgressBar c1=new CircularProgressBar(1000); // Create a circular progress bar that updates every 1000 ms
		c1.setCircularProgressBarColor(Color.red);           // Set color of circular progress bar
		c1.changePercentageChange(20);  // Change percentage change in time interval as 20
		c1.startAnimation();    //Start circular progress bar animation
		
		CircularProgressBar c2=new CircularProgressBar(2000);
		c2.setCircularProgressBarColor(Color.green);   // Set color circular progress bar
		c2.startAnimation();   //Start circular progress bar animation
		
		CircularProgressBar c3=new CircularProgressBar(1000);
		c3.setCircularProgressBarColor(Color.blue);   // Set color circular progress bar
		c3.changePercentageChange(10); // Change percentage change in time interval as 10
		c3.startAnimation();   //Start circular progress bar animation
	
		

		frame.getContentPane().add(c1,BorderLayout.WEST);  // Add circular progress bar c1
		
		frame.getContentPane().add(c2,BorderLayout.CENTER); // Add circular progress bar c2
		
		frame.getContentPane().add(c3,BorderLayout.EAST); // Add circular progress bar c3
		
		frame.pack();
		frame.setVisible(true);
	}

}
