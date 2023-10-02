import java.util.*;

public class Q3EmployeeTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs (keys) and names (values)
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add employees to the TreeMap
        employeeMap.put(101, "Eswar");
        employeeMap.put(102, "Bala");
        employeeMap.put(103, "Dinesh");
        employeeMap.put(104, "Abishek");

        // Create a list to store the sorted employee names
        List<String> sortedEmployeeNames = new ArrayList<>(employeeMap.values());

        // Sort the list of names in alphabetical order
        Collections.sort(sortedEmployeeNames);

        // Print the sorted employee names
        for (String name : sortedEmployeeNames) {
            System.out.println(name);
        }
    }
}