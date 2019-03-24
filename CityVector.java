import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class CityVector {
    public static void main(String[] args){
        Vector<String> v = new Vector<String>();
        Scanner input = new Scanner(System.in);

        boolean show = true;

        while(show){
            System.out.println("Menu:");
            System.out.println("1. Add City");
            System.out.println("2. Remove City");
            System.out.println("3. Show All Cities");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter name of the City to add: ");
                    String name = input.nextLine();
                    if(v.contains(name)){
                        System.out.println("City already entered");
                    }else{
                        v.add(name);
                        System.out.println("City added successfully");
                    }
                    break;
                case 2:
                    System.out.println("Enter name of the City to remove: ");
                    String n = input.nextLine();
                    if(v.contains(n)){
                        v.remove(n);
                        System.out.println("City removed successfully");
                    }else{
                        System.out.println("City doesn't exist");
                    }
                    break;
                case 3:
                    Iterator itr = v.iterator();
                    while(itr.hasNext()){
                        System.out.println(itr.next());
                    }
                    break;
                case 4:
                    show = false;
                    System.out.println("Menu exited");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
