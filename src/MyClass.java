public class MyClass {
     String  firstName;
     String lastName;
     int age;
     String cab;
     String Tam;


     public  MyClass() {


     }

    public MyClass(String firstName, String lastName, int age, String cab, String tam) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cab = cab;
        Tam = tam;
    }

    public MyClass(String Name, String lastName, int age, String cab) {
         this.firstName = Name;
         this.lastName = lastName;
         this.age = age;
         this.cab = cab;

    }
     void getMyClass(){
        System.out.println("Аты:"+firstName+"\n"+
                         "Фамилясы:"+lastName+"\n"+
                         "Жашы:"+age+"\n"+
                         "Катышкан с:"+cab+"\n"+
                         "Тамагы:"+Tam);}





      void setMyClass(){
         System.out.println("Аты:"+firstName+"\n"+"Фамилясы:"+lastName+"\n"+"Жашы:"+age+"\n"+"Катышкан с:"+cab+"\n");}

     }










