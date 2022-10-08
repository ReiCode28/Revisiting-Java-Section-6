import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = staffLastYear;
        staffThisYear[1] = "Abby";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
        
    }
}

/*
 * Trap:
 * Setting array variables equal to each other 
 * 
 * The state of a variable shouold not change because you updated another
 * Every variable should point to its own array
 * 
 * Solution:
 * Create a new array. Then copy every value using a loop
 * 
 * Better Solution:
 * I can use Arrays.copyOf() to set it equal to a copy of the array
 */

 //When you set a variable equal to another, it copies the value inside
 //which in this case is a reference. Updating the array through one variable
 //it will affect the other because they both point to the same array.