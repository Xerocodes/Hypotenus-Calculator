import javax.swing.JOptionPane;


public class Main{

    public static void main(final String[] args) {
    	
  
    	//Start
        JOptionPane.showMessageDialog(null, "Hypotenuse Finder V 0.3");
        JOptionPane.showMessageDialog(null, "Remember Hypotenus is the side in front of the 90degree angle of a triangle");
        
        //Inputs of Lengths
        final String Side1 = JOptionPane.showInputDialog("Enter The length of Side AB (Enter Only the Digits) ");
        final String Side2 = JOptionPane.showInputDialog("Enter The length of Side BC (Enter Only the Digits) ");
        
        //Calculations 
        final Double S1 = Double.parseDouble(Side1);
        final Double S2 = Double.parseDouble(Side2);
        
        //Pythagoras theorem
        final Double SQ1 = S1 * S1;
        final Double SQ2 = S2 * S2;
        final Double Result1 = SQ1 + SQ2;
        
        //Result 
        final Double FinalResult = Math.sqrt(Result1);
        final Long RoundedResult = Math.round(FinalResult);
        
        //Display Answer
        JOptionPane.showMessageDialog(null, "The Hypotenus/ Side AC is " + RoundedResult + " Cm / M ");
        
        
    }
}