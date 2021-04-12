package org.example.dependency;
import  org.example.innclass;
import org.example.pluginA;


import org.apache.commons.csv.*;
import java.io.*;
import java.time.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.concurrent.TimeUnit;



public class ExampleDependency  implements pluginA {
     CSVPrinter csv;
    innclass incl;
    @Override
    public  void start(innclass inc) {

             this.incl=inc;
             incl.attach(this);

            Writer writer = Files.newBufferedWriter(Paths.get("file1.csv"));
            csv = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("VAlUE_X ", "VALUE_Y"));


    }
    @Override
    public  void dosomething()  {

        csv.printRecord(incl.getX(), incl.gety());

        csv.flush();
    }
}
