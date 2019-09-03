package br.ufsc.ine5608.view;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;

public class TableFrame extends JFrame {
     private static TableFrame tfInstance = new TableFrame();    
    
    public TableFrame() {
        super("7 Wonders Duel");
        this.screenConfiguration();
    }
    
    public static TableFrame getInstance() {        
        if (tfInstance == null) {
        	tfInstance = new TableFrame();
        }        
        return tfInstance;
    }
    
    public void showScreen() {
        this.setVisible(true);
    }
    
    public void hideScreen() {
        this.setVisible(false);
    }

    public void tableRefresh() {

    }
    
    public void screenConfiguration() {
        Container container = getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();
        
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
