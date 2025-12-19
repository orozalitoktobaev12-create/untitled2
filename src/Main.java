import javax.xml.catalog.Catalog;
import java.io.PrintWriter;
import java.lang.reflect.GenericArrayType;
import java.security.cert.CertPathValidatorException;
import java.util.*;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] arg) {




//     Срок сдачи: ----
// Треугольник деген класс тузунуз.
//Класстын 3 поляси болсун a, b, c.
//Класстын "площадь" деген методу болсун.
//метод "площадь" полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)
//таянып консолго уч бурчтуктун аянтын чыгарсын.


//        Scanner sc = new Scanner(System.in);
//        Triangle triangle = new Triangle();
//         triangle.a=sc.nextInt();
//         triangle.b=sc.nextInt();
//        triangle.c=sc.nextInt();
//         triangle.square();
  //      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//        Task5:OOP-----------

        Gul gul = new Gul();
        gul.flowerName = "Роза";
        gul.freshNess = 1;
        gul.price = 5000;


        Gul gul2 = new Gul();
        gul2.flowerName = "Рамашка";
        gul2.freshNess = 2;
        gul2.price = 4000;


        Gul[] guls = {gul, gul2,};
       for (Gul g : guls) {
           System.out.println("~~~~~~~~~~~~~~~~~");
           g.getInfo();
       }

            if(gul.price>gul2.price){
                System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Эн чонуу ушул:  " +gul.price);



            }else{
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Эн чонуу ушул:  " + gul2.price);


            }







        }


    }




























































































































































































































































