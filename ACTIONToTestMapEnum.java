import java.util.HashMap;
import java.util.Map;

/**
 * Illustration of using HashMap to retrieve the value of enum.
 */
public enum ACTIONToTestMapEnum {
    READ_FILE(0),
    RESULT(1),
    TIME(2);

    private int valueAction;
    private static Map<Integer, ACTIONToTestMapEnum> map = new HashMap<Integer, ACTIONToTestMapEnum>();

    ACTIONToTestMapEnum(int t) {
        valueAction = t;
    }

    public int getValue() {
        return valueAction;
    }

    static ACTIONToTestMapEnum getByValue(int key) {
        return map.getOrDefault(key, READ_FILE);
    }

    static {
        for (ACTIONToTestMapEnum action : ACTIONToTestMapEnum.values()) {
            map.put(action.valueAction, action);
        }
    }
}
