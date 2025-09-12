import javax.swing.JFrame;
/**
 * Starter code for the Target programming activity.
 */
public class TargetViewer
{
    public static void main(String[] args)
    {
        // create frame object
        JFrame frame = new JFrame();  
        
        // set frame attributes
        frame.setSize(300, 400);
        frame.setTitle("Targets");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initialize a TargetComponent() component object
        TargetComponent component = new TargetComponent();
        
        // add the component to the frame and make visible
        frame.add(component);

        frame.setVisible(true);
    }
}
