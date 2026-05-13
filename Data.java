public class Data{

    public void details(String name){
        System.out.println(name);

    }
    public void details(String name , int rollno){
        System.out.println("name : " + name + "rollno : " +  rollno);
    }
    public void details(String name,int rollno,String course){
        System.out.println("name : " +  name  + " Roll no :  " +  rollno + "Course : "+  course);
    }
    public static void main(String[]args){
     Data d1 = new Data();
     d1.details("sakshi");
     d1.details("sakshi",1);
     d1.details("sakshi",1,"cs");


    }

}