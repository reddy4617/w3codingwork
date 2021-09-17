package BreakFast_Bread;

public class breadPresent implements Slice {
    private Bread bread;

    public breadPresent(Bread bread) {
        this.bread = bread;
    }

    public void execute(){
        bread.on();
    }
}
