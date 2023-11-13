import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Methods methods = new Methods();

        List<String> tasks = new ArrayList<>(List.of(
                "Task 1", "Task 2", "Task 3", "Task 4"
        ));

        List<String> duplicates = new ArrayList<>(List.of(
                "Apple", "Lenovo", "Lenovo", "Motorola", "Apple"
        ));

        List<String> english = new ArrayList<>(List.of(
                "Book", "Sun", "Water", "House", "Tree",
                "Friend", "Blue", "Travel", "Computer", "Moon"
        ));

        List<String> romanian = new ArrayList<>(List.of(
                "Carte", "Soare", "Apa", "Casa", "Copac",
                "Prieten", "Albastru", "Calatorie", "Calculator", "Luna"
        ));


        // Exercise 1
        System.out.println("\n");
        methods.displayTaskList(tasks);

        // Exercise 2
        System.out.println("\n");
        System.out.println("[~] Unique list: " + methods.returnUniqueValues(duplicates));

        // Exercise 3
        System.out.println("\n");
        methods.translateEnglishToRomanian(english, romanian);









    }
}