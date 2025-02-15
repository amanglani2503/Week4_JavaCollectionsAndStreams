package day5junit.basic.listmanager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManager {

    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("\nList Operations:\n1. Add Element\n2. Remove Element\n3. Get List Size\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter element to add: ");
                    int element = scanner.nextInt();
                    listManager.addElement(list, element);
                    System.out.println("Element added. List: " + list);
                }
                case 2 -> {
                    System.out.print("Enter element to remove: ");
                    int element = scanner.nextInt();
                    listManager.removeElement(list, element);
                    System.out.println("Element removed. List: " + list);
                }
                case 3 -> System.out.println("List size: " + listManager.getSize(list));
                case 4 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
