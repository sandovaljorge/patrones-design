package org.jscode.structural.facade;

public interface Recipes {

    static Boolean getRecipes(String name, Boolean make){
        String action = make ? "make" : "improve";
        if(Math.random() > 0.5 ){
            System.out.println("You have the necessary skills to " + action + " the " + name);
            return true;
        }else{
            System.out.println("You don´t have the necessary skills to " + action + " the " + name);
            return false;
        }
    }
}
