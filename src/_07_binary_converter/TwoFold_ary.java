package _07_binary_converter;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TwoFold_ary {

	public static void main(String[] args) {
	
	}
	
	
		
		public void run() {
			
			
			JFrame fram = new JFrame();
		fram.setVisible(true);
		
		
		 
		JPanel pan = new JPanel();
		fram.add(pan);

		


		
		
		
		JTextField text = new JTextField(20);
		pan.add(text);
		
		
			JButton button = new JButton();
			pan.add(button);
		
		
		JLabel name = new JLabel();
		pan.add(name);
		
		
		fram.pack();
		
		
		fram.setSize(450,70);
		fram.setTitle("🐸🐸🐸EPIC GAMES🐸🐸🐸");
		button.setText("Convert");
		
		
		button.addActionListener(null);
	}
		
	
		
	
		
		
		
		String convert(String input) {
		if(input.length() !=8) {
			JOptionPane.showMessageDialog(null,  "Enter 8 bits, silly!!!!");
			return "-" ;
		}
		
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
		
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
		}
		
		public void actionPerformed(ActionEvent button){ 
			JButton buttonPressed = (JButton) button.getSource();
			
		showUWU();	
		}
		
void showUWU() { JOptionPane.showMessageDialog(null, "Binary is robot food.");

}
		}

			
		



		
		
		
		
	
	
	

