package HVassignmentTwo;
import java.util.LinkedHashSet;
import java.util.LinkedList;
public class thirdQuestion{
    public static void main(String[] args) 
    {
        LinkedList <Integer> listOne = new LinkedList<Integer>();
        listOne.add(2);
        listOne.add(5);
        listOne.add(12);
        listOne.add(2);
        listOne.add(3);
        listOne.add(5);
        listOne.add(1);
        listOne.add(2);
        listOne.add(5);
        listOne.add(5);
        System.out.println("Before removing duplicates: "+ listOne);
        
        LinkedHashSet <Integer> listTwo = new LinkedHashSet<Integer>(listOne);

        System.out.println("After removing duplicates: "+ listTwo);
    }
}