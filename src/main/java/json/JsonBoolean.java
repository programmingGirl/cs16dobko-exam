package json;

/**
 * Created by Andrii_Rodionov on 1/4/2017.
 */
public class JsonBoolean extends Json {

    private final Boolean bool;

    public JsonBoolean(Boolean bool) {
        // ToDo
        this.bool = bool;
    }

    @Override
    public String toJson() {
        // ToDo
        return bool.toString();
    }
}
