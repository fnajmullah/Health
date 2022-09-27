import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Health {
    /**
     * Entry point to class & application.
     *
     *
     */
    public static void main(String[] args){
        System.out.println("This is Fridoon and Date & Time is:");

        // Exercise 1
        int i=0;
        char c='c';
        System.out.println(i+"<default values not printed only valid if initialized>"+c);

        // Exercise 2
        System.out.println("HelloDate:"+ new Date());

        // Exercise 3
        ATypeName b=new ATypeName();
        b.exercise3();

        // Exercise 4
        b.dataOnly();

        // Exercise 5
        System.out.println(b.dataOnly());

        // Exercise 6
        b.storage();

        // Exercise 7
        b.incrementOne(15);

        // Exercise 8
        System.out.println(ATypeName.field=98);

        // Exercise 9
        List<Integer> li =new ArrayList<Integer>();
        for(int k=1;k<=10;k++){
            li.add(k);
        }
        System.out.println("Array list size and also autoboxing: "+ li.size());


        // Exercise 10
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter your Name:\n");
//        String name=input.nextLine();
//        System.out.println("Enter your Last Name:\n");
//        String lname=input.nextLine();
//        System.out.println("Enter your Address:\n");
//        String add=input.nextLine();
//        System.out.println("\n Your Name: "+name+"\n Your Last name: "+lname+"\n Your address: "+add);

        // Exercise 11
        AllTheColorsOfTheRainbow atc=new AllTheColorsOfTheRainbow();
        atc.anIntegerRepresentingColors=34;
        atc.changeTheHueOfTheColor(atc.anIntegerRepresentingColors=34);
        System.out.println("Only runs this example that is it");

        // Exercise 12



    }

}
