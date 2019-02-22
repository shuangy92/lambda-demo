package lambda.demo;

import java.util.HashSet;
import java.util.Set;

public class StaticGenarator {
    private static final int DIVIDEND = 10;
    private static Set<Integer> container;
    static {
        container = new HashSet<>();
        for (int i = 1; i < Integer.MAX_VALUE / DIVIDEND; i++) {
            container.add(i % 10000);
        }
    }

    public static int invoke() {
        return container.size();
    }
}
