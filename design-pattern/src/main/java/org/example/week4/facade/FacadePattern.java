package org.example.week4.facade;

import org.example.week4.facade.system.SystemFacade;

public class FacadePattern {
    public void play() {
        SystemFacade systemFacade = new SystemFacade();
        systemFacade.init();
    }
}
