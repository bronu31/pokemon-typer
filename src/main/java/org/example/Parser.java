package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Parser {

    private  final String[]  gen=new String[]{"https://pokemon.fandom.com/wiki/List_of_Generation_I_Pok%C3%A9mon",
    "https://pokemon.fandom.com/wiki/List_of_Generation_II_Pok%C3%A9mon",
    "https://pokemon.fandom.com/wiki/List_of_Generation_III_Pok%C3%A9mon",
    "https://pokemon.fandom.com/wiki/List_of_Generation_IV_Pok%C3%A9mon",
    "https://pokemon.fandom.com/wiki/List_of_Generation_V_Pok%C3%A9mon",
    "https://pokemon.fandom.com/wiki/List_of_Generation_VI_Pok%C3%A9mon",
    "https://pokemon.fandom.com/wiki/List_of_Generation_VII_Pok%C3%A9mon",
    "https://pokemon.fandom.com/wiki/List_of_Generation_VIII_Pok%C3%A9mon",
    "https://pokemon.fandom.com/wiki/List_of_Generation_IX_Pok%C3%A9mon"};



    public  ArrayList<String> pars(){
        ArrayList<String> ret=new ArrayList<>();
        try {

        for (String str : gen) {
            Document doc = Jsoup.connect(str).get();
            Elements elements=doc.select(".wikitable tr td:nth-child(3)");
            for (var elem : elements){
                ret.add(elem.text());
            }
        }
        }
        catch (IOException e){
            System.out.println("Cannot access page");
        }
        return ret;
    }


}
