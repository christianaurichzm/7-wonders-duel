package br.ufsc.ine5608.controller;

import br.ufsc.ine5608.view.StartFrame;
import br.ufsc.ine5608.view.TableFrame;

public class GeneralController {
    private static GeneralController singleGeneralCtrl;    
          
    public GeneralController() {
        
    }
    
    public static GeneralController getInstance() {
        if(singleGeneralCtrl == null) 
            singleGeneralCtrl = new GeneralController();
        return singleGeneralCtrl;
    }
    
    public void startScreen() {        
        StartFrame.getInstance().showScreen();
    }
    
    public void startGame() {   
        StartFrame.getInstance().hideScreen();
        TableFrame.getInstance().showScreen();
    }
    
}
