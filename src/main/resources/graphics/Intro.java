package main.resources.graphics;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Intro extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public static void main(String[] args) {
		try {
			Intro dialog = new Intro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Intro() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblPhoto = new JLabel("");
		lblPhoto.setBounds(215, 11, 164, 189);
		contentPanel.add(lblPhoto);
		
		JTextPane txtpnIntro = new JTextPane();
		txtpnIntro.setText("Congratulations! You are the proud parent of a baby dinosaur. Keep it happy and healthy by feeding it and letting it explore, but don't keep it out too late! Good luck!");
		txtpnIntro.setBounds(46, 160, 333, 57);
		contentPanel.add(txtpnIntro);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(46, 11, 333, 125);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				okButton.setActionCommand("Next");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
