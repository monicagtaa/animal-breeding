import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CattleUtils {

    private static final List<String> names = new ArrayList<>();
    private static final Random RANDOM = new Random();
    private static int nextId = 0;

    static {
        names.add("Elena");
        names.add("Alfred");
        names.add("Beth");
        names.add("Bob");
        names.add("Beto");
        names.add("Butch");
        names.add("Charlotte");
        names.add("Clyde");
        names.add("Ester");
        names.add("Eva");
        names.add("Florence");
        names.add("Fluffy");
        names.add("Freddie");
        names.add("Grumpy");
        names.add("Holly");
        names.add("Kate");
        names.add("Knuckles");
        names.add("Lauren");
        names.add("Leo");
        names.add("Maisie");
        names.add("Max");
        names.add("Nigel");
        names.add("Rex");
        names.add("Roger");
        names.add("Scoobie");
        names.add("Spangle");
        names.add("Star");
        names.add("Sydney");
        names.add("Tiddles");
    }


    private int breedAWeight;
    private int breedBWeight;


    public static float purebredAverage(float breedAWeight, float breedBWeight) {
        return (float) (0.5 * breedAWeight + 0.5 * breedBWeight);
    }

    public static int nextUniqueId() {
        return ++nextId;
    }

    public static String generateName() {
        return names.get(RANDOM.nextInt(names.size()));
    }

    public static CattleSex generateSex() {
        int r = RANDOM.nextInt(2);
        if (r == 1) {
            return CattleSex.Cow;
        } else {
            return CattleSex.Bull;

        }
    }


    public static int generateAge() {
        return 1 + RANDOM.nextInt(6);
    }


}