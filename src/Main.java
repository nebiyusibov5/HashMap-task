import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<Integer, String>();
        student.put(101, "rollo");
        student.put(102, "floki");
        student.put(103, "bjorn");
        student.put(104, "aivar");
        student.put(102, "atelstan");


        System.out.println(student.getOrDefault(999, "not found"));
        System.out.println(student.containsKey(104));

        System.out.println(student.get(101));

        student.remove(500);
        System.out.println(student.get(500));

        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            Integer id=entry.getKey();
            String name=entry.getValue();

            System.out.println(id + ":" + name);
        }
        System.out.println(student.size());


    }
}