import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Task3_InteractiveDictionary {

    public static void main(String[] args) {

    }

    @Test
    public void Tests() {
        Dictionary d = new Dictionary();

        d.newEntry("Apple", "A fruit");
        assertEquals("A fruit", d.look("Apple"));

        d.newEntry("Soccer", "A sport");
        assertEquals("A sport", d.look("Soccer"));

        assertEquals("Cant find entry for Hi", d.look("Hi"));
        assertEquals("Cant find entry for Ball", d.look("Ball"));

        d.newEntry("soccer", "a sport");
        assertEquals("a sport", d.look("soccer"));
    }

    public static class Dictionary {
        Map<String, String> data;

        public Dictionary() {
            this.data = new HashMap<>();
        }

        public void newEntry(String key, String value) {
            for (Map.Entry<String, String> entry : this.data.entrySet()) {
                if (entry.getKey().equals(key)) {
                    throw new Error("Current world is already in dictionary: " + key);
                }
            }
            this.data.put(key, value);
        }

        public String look(String key) {
            String result = "";
            for (Map.Entry<String, String> entry : this.data.entrySet()) {
                if (entry.getKey().equals(key)) {
                    result = entry.getValue();
                    return result;
                }
            }
            return "Cant find entry for " + key;
        }
    }
}
