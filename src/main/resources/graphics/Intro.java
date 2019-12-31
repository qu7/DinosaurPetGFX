package main.resources.graphics;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Intro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	static BufferedImage introImg;
	
	public static void main(String[] args) {
		try {
			Intro dialog = new Intro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// load the intro image
		try {
			introImg = ImageIO.read(new File("src\\main\\resources\\graphics\\intro.bmp"));
		} catch (IOException e) {}
		
	}
	
	public Intro() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTextPane txtpnIntro = new JTextPane();
		txtpnIntro.setText("Congratulations! You are the proud parent of a baby dinosaur. Keep it happy and healthy by feeding it and letting it explore, but make sure it gets enough sleep! Good luck!");
		txtpnIntro.setBounds(46, 160, 333, 57);
		contentPanel.add(txtpnIntro);
		
		JLabel lblIntroLabel = new JLabel();
		lblIntroLabel.setBounds(46, 11, 333, 138);
		contentPanel.add(lblIntroLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				okButton.setActionCommand("Next");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
