package inna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main (String[] args){

    //String[] lang = new String[4];

    String[] langs = {"Java","C#","Python","PHP"};

    for (String l : langs){
    //  System.out.println("I'd like to learn language " + l);
    }

    //  List<String> languages = new ArrayList<String>();
    //languages.add("C#");
   // languages.add("Python");

    List<String> languages = Arrays.asList("Java","C#","Python","PHP");

    for (int i = 0; i < languages.size(); i++) {
     // System.out.println("I'd like to learn language " + languages.get(i));
    }

    List languages2 = Arrays.asList("Java","C#","Python","PHP");

    for (Object l : languages2) {
      System.out.println("I'd like to learn language " + l);
    }


  }
}
