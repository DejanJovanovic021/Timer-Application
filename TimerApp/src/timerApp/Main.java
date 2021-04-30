
package timerApp;

import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) {
        
        
        int chooseOption = JOptionPane.showOptionDialog(null, "Choose option", "Option dialog", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Settings", "Close"}, null);
        
        switch(chooseOption){                                                   
            
            case JOptionPane.YES_OPTION:                                        
                
                Settings settings = new Settings();                             
                
                settings.setVisible(true);                                      
                
                break;
                
            case JOptionPane.NO_OPTION:                                         
                
                break;
        }
    }
    
}
