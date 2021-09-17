package BreakFast_Bread;

public class Bread {
    private String name = "Barn Bread";
    private String size = "Large";

    public void on(){
        System.out.println("Bread Name = "+name+ " ,Size = " +size+ " \"Available\" ");
    }

    public void off(){
        System.out.println("Bread Name = " +name+ " ,Size = " +size+ " \"Not Available\" ");
    }
}

