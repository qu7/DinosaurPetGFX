package main.resources.graphics;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewDay extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static String hoursSleepText;
	public static String qualitySleepText;
	
	public static void main(String[] args) {
		try {
			NewDay dialog = new NewDay();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NewDay() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewDay = new JLabel("");
			lblNewDay.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewDay.setBounds(10, 11, 414, 29);
			contentPanel.add(lblNewDay);
		}
		
		JLabel lblSleepGot = new JLabel(hoursSleepText);
		lblSleepGot.setHorizontalAlignment(SwingConstants.CENTER);
		lblSleepGot.setBounds(10, 51, 414, 29);
		contentPanel.add(lblSleepGot);
		
		JLabel lblSleepStatus = new JLabel(qualitySleepText);
		lblSleepStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblSleepStatus.setBounds(10, 188, 414, 29);
		contentPanel.add(lblSleepStatus);
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
