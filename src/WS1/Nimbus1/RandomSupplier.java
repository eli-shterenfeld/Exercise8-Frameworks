package WS1.Nimbus1;// RandomSupplier.java
import java.util.Random;

public class RandomSupplier {
    private static Random rnd = new Random(1);

    public static Random getRnd() {
        return rnd;
    }
}