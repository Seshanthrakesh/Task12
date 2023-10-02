//Q2.Write a java program to create ArrayList and remove all elements from the ArrayList
import java.util.ArrayList;
public class Q2ArrayListOfString {

	public static void main(String[] args) {
		
		//Create an ArrayList of string
		ArrayList<String> stringList =new ArrayList<>();
		//Adding some Elements to the Arraylist
		stringList.add("Apple");
		stringList.add("Ball");
		stringList.add("Cat");
		stringList.add("dog");
		stringList.add("Elephant");
		stringList.add("Frog");
		System.out.println("Elements in the ArrayList Before Removal");
		//Display ALL Elements in the ArrayList
		for(String elements: stringList) {
			System.out.println(elements);
		}
		//Remove All the Elements In the ArrayList
		stringList.clear();
		//Display the elements in the ArrayList
		System.out.println("\nElements in the ArrayList After Removal");
		for(String elements: stringList) {
			System.out.println(elements);
		}
	}

}
