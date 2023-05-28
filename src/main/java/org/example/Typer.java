package org.example;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Typer {


    public void type(ArrayList<String> arrayList){
        try {
            Robot robot=new Robot();
            int n=arrayList.size();
            int word_size;
            String word;
            String s;
            Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection stringSelection;
            for (int i=0;i<n;i++){

                //if (word.equals("Type: Null")) continue;
                word=arrayList.get(i);
                if (word.equals("Nidoran♀")||word.equals("Nidoran♂")) word="Nidoran";
                stringSelection=new StringSelection(word);
                clipboard.setContents(stringSelection,stringSelection);


                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                System.out.println(word);
                //word_size=word.length();
                //for (int j=0;j<word_size;j++){


                    //Сайт с квизом не может нормально распознать покемонов в именах которых находится имя другого покемона
                    // придётся использовать буфер обмена
                //оригинальный код оставлю просто потому что
                    //robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(word.charAt(j)));
                    //robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(word.charAt(j)));

                    //System.out.println(word.charAt(j));
                //}
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            }
        } catch (AWTException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
           throw new RuntimeException(e);
        }
    }
}
