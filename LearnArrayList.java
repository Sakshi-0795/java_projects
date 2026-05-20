import java.util.ArrayList;
public class LearnArrayList {
     public static void main(String[]args){
        //---Simple list---
     ArrayList<Integer>list = new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(4);
     list.add(3);
     
     System.out.println(list);

     //---add element in particular position---
     list.add(1,20);
     System.out.println(list);

    
    //---add all over list into anthor list menas merge two list at one list---
     ArrayList<Integer> element = new ArrayList<>();
     element.add(12);
     element.add(13);
     element.add(15);
     element.add(16);
     element.add(27);

     list.addAll(element);
     System.out.println(list);

     //---get the eny position element---
     System.out.println(list.get(5));

     
     //---remove the element with index value---
     list.remove(1);
     System.out.println(list);

     //---but if we want the remove element eithout index value 

     list.remove(Integer.valueOf(16));
     System.out.println(list);
     
     }

}