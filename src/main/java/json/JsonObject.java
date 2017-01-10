package json;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {

    private JsonObject jsonObject ;
    private Set<JsonPair> collection = new HashSet<JsonPair>();

    public JsonObject(JsonPair... jsonPairs) {
        // ToDo

        for(JsonPair j : jsonPairs){
            collection.add(j);
            //System.out.println(j.value.toJson());
            //jsonObject.add(j);
            System.out.println(j.key);
        }
    }

    @Override
    public String toJson() {
        // ToDo
        if(collection.isEmpty()){
            return "{}";
        }
        String result = "{";
        int i = 0;
        for (JsonPair pair: collection){
            result += "'" + pair.key +"': " + pair.value.toJson();
            i++;
            if(collection.size() > 1 && i< collection.size()){
                result += ",";
            }
        }
        result += "}";
        return result;
    }

    public void add(JsonPair jsonPair) {
        // ToDo
        collection.add(jsonPair);
    }

    public Json find(String name) {
        // ToDo
        for(JsonPair pair: collection){
            if(pair.key !=  name){
                continue;
            }
            else{
                return  pair.value;
            }
        }
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        JsonObject findNames = new JsonObject();
        for (String name : names) {

            for (JsonPair pair: collection) {
                if (pair.key == name){
                    findNames.add(pair);
                }
            }
        }

        return findNames;
    }
}
