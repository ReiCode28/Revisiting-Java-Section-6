public class ArraysAndLoops {
    public static void main(String[] args) {
        String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "E A"};
        System.out.println("The number of elements is " + kingdoms.length);
        for (int i = 0; i < 4; i++ ){
            System.out.println("The element at index " + i + " is " + kingdoms[i]);
        }

    }
}

//Loops can run through elements in an array 
//If you try to go over the length of the array, you will get an index out of bounds exception error
//bc there is no element found
//Loop should only run as long as "i" is smaller than the array length