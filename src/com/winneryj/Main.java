package com.winneryj;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> myList = new ArrayList<Integer>();
	    for(int i = 0; i < 100000000; i++){
	        Thread.sleep(1000);
	        myList.add(i);
	        System.out.println(myList.size());
        }
    }
}
