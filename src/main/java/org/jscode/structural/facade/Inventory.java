package org.jscode.structural.facade;

public interface Inventory {

    static Boolean search(String name, Boolean make){
        String action = make ? "make" : "improve";
        if(Math.random() > 0.5 ){
            System.out.println("You have the necessary materials to " + action + " the " + name);
            return true;
        }else{
            System.out.println("You don´t have the necessary materials to " + action + " the " + name);
            return false;
        }
    }

    static void remove(String name, Boolean make){
        String action = make ? "make" : "improve";
        System.out.println("Removing from your inventory the materials used to " + action + " the " + name);
    }
}
