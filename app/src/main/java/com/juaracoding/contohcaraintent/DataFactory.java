package com.juaracoding.contohcaraintent;

import com.juaracoding.contohcaraintent.model.ToDoList;

import java.util.ArrayList;
import java.util.List;

public class DataFactory {


    public List<String> createDataSimpleList(){

        List<String> list = new ArrayList<String>();

        list.add("Maulana");
        list.add("Christian");
        list.add("Aldi");
        list.add("Jon");
        list.add("Jun");
        list.add("Bagus");
        list.add("Usmoyo");
        list.add("Stevan");

        return list;

    }


    public List<ToDoList> createToDoList (){

        List<ToDoList> todo = new ArrayList<ToDoList>();

        todo.add(new ToDoList("Jon","Belajar bootcamp","26 Agustus 2019","Belajar bareng sama Gina",1));
        todo.add(new ToDoList("Jun","Belajar bootcamp","26 Agustus 2019","Nemenin jon",2));
        todo.add(new ToDoList("Aldi","Belajar bootcamp","26 Agustus 2019","Belajar sendiri",3));


      return todo;
    }


}
