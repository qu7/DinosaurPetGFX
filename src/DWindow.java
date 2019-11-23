import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class DWindow extends JFrame {
	public DWindow() {
		getContentPane().setBackground(SystemColor.text);
		setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		JLabel lblHunger = new JLabel("hunger");
		lblHunger.setBounds(321, 63, 103, 14);
		getContentPane().add(lblHunger);
		
		JLabel lblHappy = new JLabel("happy");
		lblHappy.setBounds(321, 38, 103, 14);
		getContentPane().add(lblHappy);
		
		JLabel lblTime = new JLabel("Time: 06:00");
		lblTime.setBounds(321, 113, 83, 14);
		getContentPane().add(lblTime);
		
		JLabel lblFood = new JLabel("Food: ");
		lblFood.setBounds(321, 171, 103, 14);
		getContentPane().add(lblFood);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(321, 88, 103, 14);
		getContentPane().add(lblAge);
		
		JLabel lblGold = new JLabel("Gold: ");
		lblGold.setBounds(321, 196, 103, 14);
		getContentPane().add(lblGold);
		
		JLabel lblKeys = new JLabel("Keys: ");
		lblKeys.setBounds(321, 221, 103, 14);
		getContentPane().add(lblKeys);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(321, 13, 103, 14);
		getContentPane().add(lblName);
		
		JLabel lblText = new JLabel();
		lblText.setForeground(Color.BLACK);
		lblText.setBackground(Color.WHITE);
		lblText.setBounds(10, 133, 287, 62);
		getContentPane().add(lblText);
		lblText.setText(Routine.textLine);
		
		JButton btnFeed = new JButton("Feed");
		btnFeed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Routine.feedDino();
				lblText.setText(Routine.textLine);
				lblFood.setText("Food: " + String.valueOf(Routine.food));
				lblTime.setText("Time: " + String.valueOf(Routine.time));
				lblKeys.setText("Keys: " + String.valueOf(Routine.key));
				lblHappy.setText("happy");
				lblHunger.setText(Routine.hungerText);
			}
		});
		btnFeed.setBounds(10, 206, 89, 44);
		getContentPane().add(btnFeed);
		
		JButton btnExplore = new JButton("Explore");
		btnExplore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Routine.explore();
				lblText.setText(Routine.textLine);
				lblFood.setText("Food: " + String.valueOf(Routine.food));
				lblTime.setText("Time: " + String.valueOf(Routine.time));
				lblKeys.setText("Keys: " + String.valueOf(Routine.key));
				lblHappy.setText("happy");
				lblHunger.setText(Routine.hungerText);
			}
		});
		btnExplore.setBounds(109, 206, 89, 44);
		getContentPane().add(btnExplore);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Routine.play();
				lblText.setText(Routine.textLine);
				lblFood.setText("Food: " + String.valueOf(Routine.food));
				lblTime.setText("Time: " + String.valueOf(Routine.time));
				lblKeys.setText("Keys: " + String.valueOf(Routine.key));
				lblHappy.setText("happy");
				lblHunger.setText(Routine.hungerText);
			}
		});
		
		btnPlay.setBounds(208, 206, 89, 44);
		getContentPane().add(btnPlay);
	

	}
		
	public static void main(String args[]) {
		DWindow window = new DWindow();
		window.setSize(460, 300);
		window.setVisible(true);
		new Routine();
		window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
