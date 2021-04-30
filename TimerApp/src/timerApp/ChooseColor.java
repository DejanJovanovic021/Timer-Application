
package timerApp;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ChooseColor {
    
    
    JColorChooser jcc = new JColorChooser();                                    
    Color c = jcc.showDialog(null, "Choose color", Color.white);                
    
    static JFrame f;
    
    static void colorFrame(){                                                   
        
        f = new JFrame();
        f.setSize(600, 400);
        f.setLocation(100, 100);
        f.getContentPane().setBackground(null);
        
        ImageIcon colorIcon = new ImageIcon("color.png");                       
        f.setIconImage(colorIcon.getImage());                                   
        
        f.setVisible(true);
    }
    
    @Override
    public String toString() {                                                  
        return "RGB ("+c.getRed()+" , "+c.getGreen()+" , "+c.getBlue()+")";
    }
    
    
    
    
}
