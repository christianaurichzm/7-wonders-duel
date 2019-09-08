package br.ufsc.ine5608.controller;

import br.ufsc.ine5608.view.FinalFrame;
import br.ufsc.ine5608.view.StartFrame;
import br.ufsc.ine5608.view.BoardFrame;

public class GeneralController {
    private static GeneralController singleGeneralCtrl;    
          
    public GeneralController() {
        
    }
    
    public static GeneralController getInstance() {
        if(singleGeneralCtrl == null) 
            singleGeneralCtrl = new GeneralController();
        return singleGeneralCtrl;
    }
    
    public void startFrame() {        
        StartFrame.getInstance().showFrame();
    }
    
    public void startGame() {   
        StartFrame.getInstance().hideFrame();
        BoardFrame.getInstance().showFrame();
    }
    
    public void finalFrame() {
    	BoardFrame.getInstance().hideFrame();
    	FinalFrame.getInstance().showFrame();
    }
    
}