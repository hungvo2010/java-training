import java.util.HashMap;
import java.util.Map;

/**
 * Illustration of using HashMap to retrieve the value of enum.
 */
public enum ACTION {
    READ_FILE(0),
    RESULT(1),
    TIME(2);

    private int valueAction;
    private static Map<Integer, ACTION> map = new HashMap<Integer, ACTION>();

    ACTION(int t) {
        valueAction = t;
    }

    public int getValue() {
        return valueAction;
    }

    static ACTION getByValue(int key) {
        return map.getOrDefault(key, READ_FILE);
    }

    static {
        for (ACTION action : ACTION.values()) {
            map.put(action.valueAction, action);
        }
    }
}
