package org.example;

import java.util.ArrayList;
import java.util.List;
public class innclass {
    int x;
    int max;
    int min;
    int incrx;
    int y;
    String expression;
   private List<pluginA> plugi = new ArrayList<pluginA>();
 

   public int getX() {

       return x;
   }

   public void setx(int x) {
      this.x = x;

   }
    public int getmaxX() {

        return max;
    }

    public void setmaxx(int max) {
        this.max = max;

    }
    public int gety() {

        return y;
    }

    public void setY(int y) {
        this.y = y;
        notifyAllObservers();

    }
    public int getminX() {

        return min;
    }

    public void setminx(int min) {
        this.min = min;

    }
    public String getExpr() {

        return expression;
    }

    public void setexpr(String expression) {
        this.expression = expression;

    }
    public int getincrx() {

        return incrx;
    }

    public void setincx(int incrx) {
        this.incrx = incrx;

    }

   public void attach(pluginA plug){

       plugi.add(plug);
   }

   public void notifyAllObservers(){
      for (pluginA plug : plugi) {
         plug.dosomething();
      }
   }


}