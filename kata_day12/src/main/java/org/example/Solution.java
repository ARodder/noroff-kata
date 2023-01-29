package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static double price(Integer[] cart) {
        double price = 0;
        if(cart.length == 0) return price;
        Set<Integer> uniqueCart = new HashSet<>();

        for(Integer number : cart){
            if(!uniqueCart.contains(number))uniqueCart.add(number);
        }

        if (uniqueCart.size() == 1) {
            price += 8;
        } else if (uniqueCart.size() == 2) {
            price += 8 * 2 * 0.95;
        } else if (uniqueCart.size() == 3) {
            price += 8 * 3 * 0.90;
        } else if (uniqueCart.size() == 4) {
            price += 8 * 4 * 0.80;
        }

        ArrayList<Integer> secondCart = new ArrayList<>(Arrays.asList(cart));

        for(Integer number: uniqueCart){
            secondCart.remove(number);
        }

        if(secondCart.size() >0){
            price +=price(secondCart.toArray(new Integer[0]));
        }else{
            price += 8*(cart.length - uniqueCart.size());
        }


        return price;
    }

}
