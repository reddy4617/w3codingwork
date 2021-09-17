package BreakFast_Bread;

public class breadNotPresent implements Slice {
    private Bread bread;

    public breadNotPresent(Bread bread) {
        this.bread = bread;
    }

    public void execute(){
        bread.off();
    }
}
