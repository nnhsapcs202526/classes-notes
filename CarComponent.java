import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
   This component constructs and draws two car shapes.
*/
public class CarComponent extends JComponent
{  
   @Override
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;  // cast to Graphics2D object
      
      // initialize a new Car object
      Car car1 = new Car(0, 0); 
      
      int x = this.getWidth() - 60;
      int y = this.getHeight() - 30;
      
      // initialize a 2nd Car object
      Car car2 = new Car(x, y); 
      
      // draw cars
      car1.draw(g2);
      car2.draw(g2);      
   }
}
