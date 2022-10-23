import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int people = scan.nextInt();


        String[][] database = new String[people][3];

        scan.nextLine();
        for(int i = 0; i < database.length; i++){
            System.out.println("\n\tFigure " + (i+1));

            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();

            System.out.print("\t - Date: ");
            database[i][1] = scan.nextLine();

            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();

            System.out.println("\n");    
            
        }
        System.out.println("These are the values you stored:\n"); 
        print2DArray(database);

        System.out.print("\nWho do you want information on? ");
        String name = scan.nextLine();
        System.out.println("\n");
        for(int i = 0; i < database.length; i++){
            if(database[i][0].equals(name)){
                System.out.println("\tName: " + database[i][0]);
                System.out.println("\tDate of Birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
            }
        } 



        
        scan.close();    
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside this function
     *  1. prints the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • prints a new line.
     */

     public static void print2DArray(String[][] array){
        for(int i = 0; i < array.length; i++){
            System.out.print("\t");
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
     }

}
