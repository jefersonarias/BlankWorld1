import java.awt.*;
import java.awt.event.*;

/**
 * Sample application using Frame.
 *
 * @author 
 * @version 1.00 19/12/20
 */
public class BlankWorldFrame extends Frame {
    
    /**
     * The constructor.
     */  
     public BlankWorldFrame() {
                
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu();
        MenuItem menuFileExit = new MenuItem();
        
        menuFile.setLabel("File");
        menuFileExit.setLabel("Exit");
        
        // Add action listener.for the menu button
        menuFileExit.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    BlankWorldFrame.this.windowClosed();
                }
            }
        ); 
        menuFile.add(menuFileExit);
        menuBar.add(menuFile);
        
        setTitle("BlankWorld");
        setMenuBar(menuBar);
        setSize(new Dimension(400, 400));
        
        // Add window listener.
        this.addWindowListener
        (
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    BlankWorldFrame.this.windowClosed();
                }
            }
        );  
    }
    
    
    /**
     * Shutdown procedure when run as an application.
     */
    protected void windowClosed() {
    	
    	// TODO: Check if it is safe to close the application
    	
        // Exit application.
        System.exit(0);
    }
}