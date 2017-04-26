/*
* Name: David Rodriguez
* Section: COSC/ITSE 1336
* Homework: MyBasket
* Description: Easter Egg Basket code that displays different eggs with the ability to change the inside
*/

/*
* -------------------------------PSUDO CODE---------------------------------------------
*  1) Should be able load "MyEgg"
*  2) Should be able to change the symbols on the inside of the egg
*  3) Should display three eggs with different symbols in them using an array list
*---------------------------------------------------------------------------------------
*/

import java.util.*;
import java.util.io;

public class MyBasket {

    ArrayList<MyEgg> aryMyBasket = new ArrayList<MyEgg>();


    public static void main (String [] args){
        Basket objMyBasket = new MyBasket();
        MyEgg objAnEgg = new MyEgg('1');
        objBasket.add(new MyEgg());
        objBasket.add(new MyEgg('-'));
        objBasket.add(new MyEgg('2'));
        System.out.println(objBasket);System.out.println(objSingleEgg.compareTo(objSingleEgg));
        System.out.println(objSingleEgg.compareTo(objBasket.get(0)));
        System.out.println(objSingleEgg.compareTo(objBasket.get(2)));
    }

    public EasterEgg get(int intIndex) {
        return aryBasket.get(intIndex);
    }

    public void add(EasterEgg objEgg) {
        aryBasket.add(objEgg);
    }

    public String toString() {
        return aryBasket.toString();
    }

}

