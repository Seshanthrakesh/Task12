//Q4.Write a program to convert list to array.
	import java.util.ArrayList;
	import java.util.List;

	public class Q4ListToArray{
	    public static void main(String[] args) {
	        // Create a list
	        List<String> myList = new ArrayList<>();
	        myList.add("Hello");
	        myList.add("World");
	        myList.add("Java");
	        
	        // Convert the list to an array
	        String[] myArray = myList.toArray(new String[myList.size()]);
	        
	        // Print the elements of the array
	        for (String element : myArray) {
	            System.out.println(element);
	        }
	    }
	}

