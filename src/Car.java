public class Car {
    private String carName;
    private String carColor;
    private int carPrice;

    public void  setCarName(String carName){
        this.carName = carName;
    }
    public  void setCarColor(String carColor){
        this.carColor=carColor;
    }
    public void setCarPrice(int carPrice){
        this.carPrice=carPrice;
    }
    public String getCarName(){
        return carName;

    }
    public String getCarColor(){
        return carColor;
    }
    public int getCarPrice(){
        return carPrice;
    }

    public  void getCar(){
        System.out.println("Name:"+carName+"\n"+"Int:"+carColor+"\n"+"Addres:"+carPrice);
    }
}
