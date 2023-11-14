import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Methods {

    public void displayTaskList(List<String> list_) {

        System.out.print("[~] Task list: ");
        for (String task: list_) {
            System.out.print(task + " ");
        }

    }

    public Set<String> returnUniqueValues(List<String> list_) {

        return new HashSet<>(list_);
    }

    public void translateEnglishToRomanian(List<String> listEng, List<String> listRo) {

        System.out.println("[~] Translation:");
        System.out.println("  EN   ->   RO  ");
        for (int idx = 0; idx < 10; idx++) {
            System.out.println(listEng.get(idx) + " -> " + listRo.get(idx));
        }

    }

}