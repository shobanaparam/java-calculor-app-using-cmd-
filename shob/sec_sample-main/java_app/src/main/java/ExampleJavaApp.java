package org.example;

import org.example.dependency.*;
import java.math.BigDecimal; 
import org.example.pluginA;
//import org.example.dependency.ExampleDependency;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class ExampleJavaApp
{
    static
    {
        System.loadLibrary("example_c_library");
    }

    public static void main(String[] args)throws ScriptException 
    {
	innclass inc= new innclass();
        ExampleDependency exa= new ExampleDependency();




		Object eval; 
		int value;
        Scanner in = new Scanner(System.in);
            System.out.println("enter expression: ");
            String s = in.next();
            System.out.println("enter max x : ");
            String mx = in.next();

	    inc.setmaxx(Integer.parseInt(mx));
            System.out.println("enter min x : ");
            String mn = in.next();
        inc.setminx(Integer.parseInt(mn));
            System.out.println("enter increment x : ");
            String ix = in.next();
        inc.setincx(Integer.parseInt(ix));
        System.out.println("you entered :expression  " + s);
        System.out.println("you entered min x  : " + mn);
        System.out.println("you entered max x : " + mx);
        System.out.println("you entered increment x : " + ix);
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            String foo = s;
            char[] arr = foo.toCharArray();
            Boolean flag = false;
            char y ='a';
            String exp ="";
	
	    
	int counter = 0;
            for (int z = Integer.parseInt(mn); z < Integer.parseInt(mx); z+=Integer.parseInt(ix))
	 {
		
              

                for (int i = 0; i < arr.length; i++)
               {
                    

                    if(i >0){
                        if(arr[i] == 'x')
                        {
                            y = arr[i-1];
                            flag = Character.isDigit(y);
                        }
                    }
                    if(flag)
                    {
                        exp = exp + '*'+z;
                        flag= false;
                    }
                    else if(arr[i] == 'x')
                    {
                        exp =  exp + z;
                    }else
                    {
                        exp =  exp + arr[i];
                    }
				  

                }
           
                
counter++;
                eval=engine.eval(exp);
                value = new BigDecimal(eval.toString()).intValue(); 
		        inc.setx(z);
                inc.setY(value);
              
                System.out.println(exp);
                System.out.println(engine.eval(exp));
                exp ="";
               exa.start(inc);
            }
System.out.println("total process is "+counter);

hello();

 
long total1 = 10;
    long startTime = System.currentTimeMillis();

    for (int m = 1; m <= total1; m = m + 3) {
        try {
            Thread.sleep(50);
            prog.printProgress(startTime, total1, m);
        } catch (InterruptedException e) {
        }
    }
    
    
   }
   public static native void hello();
//    public static native void sum(int n);
//    public static native int product(int n);
}







