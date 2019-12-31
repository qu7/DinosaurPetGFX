package main.resources.graphics;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Death extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static String deathMessage;
	
	public static void main(String[] args) {
		try {
			Death dialog = new Death();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Death() {
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblSelectNewEgg = new JLabel("Game over.");
		lblSelectNewEgg.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectNewEgg.setBounds(10, 174, 414, 14);
		contentPanel.add(lblSelectNewEgg);
		
		JLabel lblDeathText = new JLabel(deathMessage);
		lblDeathText.setBounds(10, 11, 414, 84);
		contentPanel.add(lblDeathText);
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
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
