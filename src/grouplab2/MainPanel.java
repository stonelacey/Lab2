/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouplab2;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Salad
 */
public class MainPanel extends JPanel{
    private JButton stone;
    MainPanel()
    {
        stone = new JButton("Stone");
        add(stone);
    }
    
}
