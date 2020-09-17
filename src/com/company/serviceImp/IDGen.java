package com.company.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IDGen {

    private static List<Integer> usedIds = new ArrayList<Integer>();

    public static int generate(){
        Random rand = new Random();
        int randint;
        randint = rand.nextInt((1000 - 1)+1)+1;
        while (usedIds.contains(randint)){
            randint = rand.nextInt((1000 - 1)+1)+1;
        }
        usedIds.add(randint);
        return randint;
    }
}
