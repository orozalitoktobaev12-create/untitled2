import javax.crypto.MacSpi;
import javax.xml.catalog.Catalog;
import java.io.PrintWriter;
import java.lang.reflect.GenericArrayType;
import java.security.cert.CertPathValidatorException;
import java.util.*;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] arg) {

        University university1 = new University();
        university1.setName("Manas");
        university1.setAge(1995);
        university1.setAddress("Bishkek");


        String[] un = {"university1"};
        for (String u : un) {
            System.out.println(u);
            university1.getUniver();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }
        University university2 = new University();
        university2.setName("Aloo Too");
        university2.setAge(1996);
        university2.setAddress("Bishkek");

        String[] up = {"university2"};
        for (String a : up) {
            System.out.println(a);
            university2.getUniver();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

        University university3 = new University();
        university3.setName("Osh");
        university3.setAge(1939);
        university3.setAddress("Osh");

        String[] upa = {"university3"};
        for (String b : upa) {
            System.out.println(b);
            university3.getUniver();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        }


        School school1 = new School();
        school1.setSchoolName("Jalal abad");
        school1.setSchoolAge(1993);
        school1.setSchoolAddress("Jalal abad");

        String[] upv = {"school1"};

        for (String a : upv) {
            System.out.println(a);
            school1.setSchooll();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");


            School school2 = new School();
            school2.setSchoolName("Batken");
            school2.setSchoolAge(1994);
            school2.setSchoolAddress("Batken");

            String[] usa = {"School2"};
            for(String m:usa){
                System.out.println(m);
                school2.setSchooll();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
            }

            School school3 = new School();
           school3.setSchoolName("Chui");
           school3.setSchoolAge(1992);
           school3.setSchoolAddress("Chui");

           String[] usb = {"School3"};
           for(String l:usb){
                System.out.println(l);
                school3.setSchooll();
               System.out.println("~~~~~~~~~~~~~~~~~~");
           }
           Car car1 = new Car();
           car1.setCarName("Bmw");
            car1.setCarColor("Red");
            car1.setCarPrice(12000);

            String []wer={"Car1"};
            for(String w:wer){
                System.out.println(w);
                car1.getCar();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


            }
            Car car2 = new Car();
            car2.setCarName("Mers");
            car2.setCarColor("black");
           car2.setCarPrice(11000);

           String []qwe={"Car2"};
           for(String w:qwe){
               System.out.println(w);
               car2.getCar();
           }

            Car car3 = new Car();
            car3.setCarName("Porter");
           car3.setCarColor("green");
            car3.setCarPrice(10000);
            System.out.println("~~~~~~~~~~~~~~~");

            String[]ade={"Car3"};
            for(String w:ade){
                System.out.println(w);
                car3.getCar();
                System.out.println("~~~~~~~~~~~~~~~~~~`````");
            }

            }
        Person person1 = new Person();
        person1.setFirstName("Munar");
        person1.setLastName("Toktobaev");
        person1.setAge(2007);
        String [] gwe={"Person"};
        for(String x:gwe){
            System.out.println(x);
            person1.getPerson();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
            }

            Person person2 = new Person();
             person2.setFirstName("Azamat");
             person2.setLastName("Abduahadov");
             person2.setAge(2008);
             String []erd={"Person2"};
             for(String x:erd){
                 System.out.println(x);
                 person2.getPerson();
                 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
             }
             Person person3 = new Person();
             person3.setFirstName("Mari");
             person3.setLastName("Abdulakimov");
             person3.setAge(2009);
             String []erdi={"Person3"};
             for(String x:erdi){
                 System.out.println(x);
                 person3.getPerson();

             }


            }




}







//
//
//












//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    Person person3 = new Person();
//            person3.setFirstName("Azamat");
//            person3.setLastName("Kurbanov");
//            person3.setAge(2008);







































































































































































































































































