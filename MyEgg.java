/*
* Name: David Rodriguez
* Section: COSC/ITSE 1336
* Homework: MyBasket
* Description: Easter Egg Basket code that displays different eggs with the ability to change the inside this class though is 
* for the getters and setters that will be used for the program.
*/

/*
* -------------------------------PSUDO CODE---------------------------------------------
*  1) Should be able load "MyEgg"
*  2) Should be able to change the symbols on the inside of the egg
*  3) Should display three eggs with different symbols in them  
*---------------------------------------------------------------------------------------
*/

import java.util.*;
import java.util.io;

    public class MyEgg {

        private char chrSymbol = "#";

    public static void main (String [] args){

        MyEgg objEggs = new MyEgg();
        System.out.println(objEggs);
            objEggs.print("-");
    }
    public MyEgg();{
        objEggs.pring("#");
    }
    public void setSymbol(Char pcharSymbol);{
        chrSymbol = pcharSymbol;
    }
    public char getSymbol(){
        return this. chrSymbol;
    }
    public void print(char pchrSymbol) {
        setSymbol = pchrSymbol;
        System.out.println(this);
    }
     public String toString() {
        String strEgg = "";
        strEgg += "  __  \n";
        strEgg += " /" + getSymbol() + getSymbol() + "\\ \n";
        strEgg += "/"  + getSymbol() + getSymbol() + getSymbol() + getSymbol() + "\\ \n";
        strEgg += "|"  + getSymbol() + getSymbol() + getSymbol() + getSymbol() + "|\n";
        strEgg += "\\____/\n";
        return strEggs;
     }
     public String toString() {
        String strEgg = "";
        strEgg += "  __  \n";
        strEgg += " /" + getSymbol() + getSymbol() + "\\ \n";
        strEgg += "/"  + getSymbol() + getSymbol() + getSymbol() + getSymbol() + "\\ \n";
        strEgg += "|"  + getSymbol() + getSymbol() + getSymbol() + getSymbol() + "|\n";
        strEgg += "\\____/\n";
        return strEgg;
    }

    public int compareTo(MyEgg objEggs) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        if(this == objEggs) return EQUAL;
        if(this.getSymbol() < objEggs.getSymbol()) return BEFORE;
        if(this.getSymbol() == objEggs.getSymbol()) return EQUAL;
        if(this.getSymbol() > objEggs.getSymbol()) return AFTER;

        return AFTER;
    }
}