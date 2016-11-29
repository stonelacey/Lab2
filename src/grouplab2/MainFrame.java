/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouplab2;

import javax.swing.JFrame;

/**
 *
 * @author Salad
 */
public class MainFrame extends JFrame 
{
    //single constructor for our panel
    MainFrame()
    {
    //title bar
    super("Lab2");
    
    //creates panel object
    MainPanel mPanel = new MainPanel();
    
    getContentPane().add(mPanel);
    //sets size x,y
    setSize(778, 180);
    //makes it kill on close
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //sets it so the window is visable
    //why this isnt default I have no idea
    setVisible(true);
    
    }
    
}
