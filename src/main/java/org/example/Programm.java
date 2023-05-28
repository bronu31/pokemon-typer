package org.example;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Programm {

    public Programm() {
        Parser parser = new Parser();
        ArrayList<String> list=parser.pars();
        Typer typer=new Typer();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        typer.type(list);
    }
}
