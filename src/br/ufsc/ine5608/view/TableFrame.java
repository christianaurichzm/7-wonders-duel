package br.ufsc.ine5608.view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableFrame extends JFrame {
     private static TableFrame tfInstance = new TableFrame();    
     private JLabel lbProgress;
     private JLabel lbConflict;
     private JLabel lbCardBoard;
     private JLabel lbPlayersItens;
     private JTable tbProgress;
     private JTable tbConflict;
     private JTable tbCardBoard;
     private JTable tbPlayersItens;
     private JScrollPane spProgress;
     private JScrollPane spConflict;
     private JScrollPane spCardBoard;
     private JScrollPane spPlayersItens;
    
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
    
    public void showFrame() {
        this.setVisible(true);
    }
    
    public void hideFrame() {
        this.setVisible(false);
    }

    public void tableRefresh() {

    }
    
    public void screenConfiguration() {
        Container container = getContentPane();
        container.setSize(1280, 720);
        container.setLayout(new GridBagLayout());
        
        // Progress label configuration
        {
            lbProgress = new JLabel();
            lbProgress.setText("Progresso:");
            GridBagConstraints cons = new GridBagConstraints();
            cons.ipadx = 1280;            
            cons.gridy = 0;
            cons.gridx = 0;
            container.add(lbProgress, cons);
        }
        
        // Progress table configuration
        {
            tbProgress = new JTable();
            tbProgress.setPreferredScrollableViewportSize(new Dimension(400, 50));
            tbProgress.setFillsViewportHeight(true);
            GridBagConstraints cons = new GridBagConstraints();
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.gridheight = 1;
            cons.gridwidth = 1;
            cons.gridx = 0;
            cons.gridy = 1;
            spProgress = new JScrollPane(tbProgress);
            // tbWonders.addMouseListener(tableManager);
            container.add(spProgress, cons);            
        }
        
        // Conflict label configuration
        {
            lbConflict = new JLabel();
            lbConflict.setText("Conflito:");
            GridBagConstraints cons = new GridBagConstraints();
            cons.gridy = 2;
            cons.gridx = 0;
            container.add(lbConflict, cons);
        }
        
        // Conflict table configuration
        {
            tbConflict = new JTable();
            tbConflict.setPreferredScrollableViewportSize(new Dimension(400, 50));
            tbConflict.setFillsViewportHeight(true);
            GridBagConstraints cons = new GridBagConstraints();
            cons.fill = GridBagConstraints.HORIZONTAL;            
            cons.gridheight = 1;
            cons.gridwidth = 1;
            cons.gridx = 0;
            cons.gridy = 3;
            spConflict = new JScrollPane(tbConflict);
            // tbWonders.addMouseListener(tableManager);
            container.add(spConflict, cons);            
        }
        
     // Cardboard label configuration
        {
            lbCardBoard = new JLabel();
            lbCardBoard.setText("Cartas da mesa:");
            GridBagConstraints cons = new GridBagConstraints();
            cons.gridy = 4;
            cons.gridx = 0;
            container.add(lbCardBoard, cons);
        }
        
        // Cardboard table configuration
        {
            tbCardBoard = new JTable();
            tbCardBoard.setPreferredScrollableViewportSize(new Dimension(400, 200));
            tbCardBoard.setFillsViewportHeight(true);
            GridBagConstraints cons = new GridBagConstraints();
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.ipady = 200;
            cons.gridheight = 1;
            cons.gridwidth = 1;
            cons.gridx = 0;
            cons.gridy = 5;
            spCardBoard = new JScrollPane(tbCardBoard);
            // tbWonders.addMouseListener(tableManager);
            // DefaultTableModel modelCards = new DefaultTableModel();
            // modelCards.addColumn("Diponíveis");
            // modelCards.addColumn("Bloqueadas");
            // this.tbCardBoard.setModel(modelCards);
            this.repaint();
            container.add(spCardBoard, cons);            
        }
        
     // Players itens label configuration
        {
            lbPlayersItens = new JLabel();
            lbPlayersItens.setText("Seus itens:");
            GridBagConstraints cons = new GridBagConstraints();
            cons.gridy = 7;
            cons.gridx = 0;
            container.add(lbPlayersItens, cons);
        }
        
     // Players itens table configuration
        {
            tbPlayersItens = new JTable();
            tbPlayersItens.setPreferredScrollableViewportSize(new Dimension(400, 200));
            tbPlayersItens.setFillsViewportHeight(true);
            GridBagConstraints cons = new GridBagConstraints();
            cons.fill = GridBagConstraints.HORIZONTAL;
            cons.ipady = 200;
            cons.gridheight = 1;
            cons.gridwidth = 1;
            cons.gridx = 0;
            cons.gridy = 8;
            spPlayersItens = new JScrollPane(tbPlayersItens);
            // tbWonders.addMouseListener(tableManager);  
            this.repaint();
            container.add(spPlayersItens, cons);            
        }
        
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
