import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        Generyka<String> generyka = new Generyka<String>("test");
        System.out.println(generyka.getFiled());

        Generyka<Integer> generyka1 = new Generyka<Integer>(1212);
        System.out.println(generyka.getFiled())

    }
}
