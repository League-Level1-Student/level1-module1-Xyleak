package _07_binary_converter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TwoFold_ary {

	public static void main(String[] args) {
		
	
	JFrame pic = new JFrame(); {
	
JPanel pan = new JPanel();
		
JTextField answer = new JTextField(20);

		JButton lever = new JButton();
		
		JLabel name = new JLabel();
		
		
		pic.add(pan);
		pic.setVisible(true);
		pic.add(lever);
		pic.add(answer);
		pic.add(name);
		pic.pack();
		
		lever.addActionListener(null);
	}
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
			
			
			
	
		
		
		
		
	
	
	
}

