import java.util.EnumMap;
import java.util.Map;

public class Main {

    // 1️⃣ Define an enum
    enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }

    public static void main(String[] args) {

        // 2️⃣ Create an EnumMap whose key type is Day
        Map<Day, String> schedule = new EnumMap<>(Day.class);

        // 3️⃣ Put values
        schedule.put(Day.MON, "Team stand-up");
        schedule.put(Day.FRI, "Sprint retrospective");
        schedule.put(Day.SAT, "Family time");

        // 4️⃣ Retrieve
        System.out.println("Plan for Friday: " + schedule.get(Day.FRI));

        // 5️⃣ Iterate – follows enum declaration order
        schedule.forEach((day, task) -> System.out.println(day + " → " + task));
    }
}
