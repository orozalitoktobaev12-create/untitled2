public class School {
    private  String schoolName;
    private  int schoolAge;
    private  String schoolAddress;

    public void setSchoolName(String schoolName){
        this.schoolName=schoolName;

    }
    public void setSchoolAge(int schoolAge){
        this.schoolAge=schoolAge;
    }
    public void setSchoolAddress(String schoolAddress){
        this.schoolAddress=schoolAddress;
    }
    public String getSchoolName(){
        return schoolName;
    }
    public int getSchoolAge(){
        return schoolAge;
    }
    public String getSchoolAddress(){
        return schoolAddress;
    }

    public void setSchooll(){
        System.out.println("Name:"+schoolName+"\n"+"Int:"+schoolAge+"\n"+"Addres:"+schoolAddress);
    }





}
