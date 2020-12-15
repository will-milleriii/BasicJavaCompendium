package AbstractDataTypes;

public class App {

    public static void main(String[] args){
        Counter counter = new Counter("counter");

        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.getCurrentValue());

    }
}
