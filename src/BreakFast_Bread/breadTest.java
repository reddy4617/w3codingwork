package BreakFast_Bread;

public class breadTest {
    public static void main(String[] args) {
        Bread book = new Bread();

        breadPresent present = new breadPresent(book);
        breadNotPresent notPresent = new breadNotPresent(book);

        orderBread order = new orderBread();

        order.take(present);
        order.take(notPresent);

        order.place();
    }
}