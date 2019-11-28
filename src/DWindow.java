import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import main.resources.graphics.Intro;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		lblName.setText(Routine.tri.name);
		
		JLabel lblText1 = new JLabel();
		lblText1.setForeground(Color.BLACK);
		lblText1.setBackground(Color.WHITE);
		lblText1.setBounds(10, 129, 287, 21);
		getContentPane().add(lblText1);
		lblText1.setText("");
		lblText1.setForeground((Color.LIGHT_GRAY));
		
		JLabel lblText2 = new JLabel();
		lblText2.setText((String) null);
		lblText2.setForeground(Color.BLACK);
		lblText2.setBackground(Color.WHITE);
		lblText2.setBounds(10, 150, 287, 21);
		getContentPane().add(lblText2);
		lblText2.setText("");
		lblText2.setForeground((Color.GRAY));
		
		JLabel lblText3 = new JLabel();
		lblText3.setText((String) null);
		lblText3.setForeground(Color.BLACK);
		lblText3.setBackground(Color.WHITE);
		lblText3.setBounds(10, 171, 287, 21);
		getContentPane().add(lblText3);
		lblText1.setText("");
		lblText3.setForeground((Color.BLACK));

		JButton btnFeed = new JButton("Feed");
		btnFeed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Routine.feedDino();
				lblText1.setText(Routine.textArray.get(0));
				lblText2.setText(Routine.textArray.get(1));
				lblText3.setText(Routine.textArray.get(2));
				lblFood.setText("Food: " + String.valueOf(Routine.food));
				lblTime.setText("Time: " + String.valueOf(Routine.time));
				lblKeys.setText("Keys: " + String.valueOf(Routine.key));
				lblAge.setText("Age: " + String.valueOf(Routine.age) + " days");
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
				lblText1.setText(Routine.textArray.get(0));
				lblText2.setText(Routine.textArray.get(1));
				lblText3.setText(Routine.textArray.get(2));
				lblFood.setText("Food: " + String.valueOf(Routine.food));
				lblTime.setText("Time: " + String.valueOf(Routine.time));
				lblKeys.setText("Keys: " + String.valueOf(Routine.key));
				lblAge.setText("Age: " + String.valueOf(Routine.age) + " days");
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
				lblText1.setText(Routine.textArray.get(0));
				lblText2.setText(Routine.textArray.get(1));
				lblText3.setText(Routine.textArray.get(2));
				lblFood.setText("Food: " + String.valueOf(Routine.food));
				lblTime.setText("Time: " + String.valueOf(Routine.time));
				lblKeys.setText("Keys: " + String.valueOf(Routine.key));
				lblAge.setText("Age: " + String.valueOf(Routine.age) + " days");
				lblHappy.setText("happy");
				lblHunger.setText(Routine.hungerText);
			}
		});
		
		btnPlay.setBounds(208, 206, 89, 44);
		getContentPane().add(btnPlay);
	
	}
		
	public static void main(String args[]) {
		DWindow window = new DWindow();
		window.setTitle("DinosaurPetGFX");
		window.setSize(460, 300);
		window.setVisible(true);
		new Routine();
		window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
