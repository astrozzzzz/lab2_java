import java.util.HashMap;
import java.util.Map;

public class City {
    private String name;
    private Map<City, Integer> paths;

    public City(String name) {
        this.name = name;
        this.paths = new HashMap<>();
    }

    public City(String name, Map<City, Integer> p) {
        this.name = name;
        this.paths = new HashMap<>(p);
    }

    public String getName() {
        return name;
    }

    public Map<City, Integer> getPaths() {
        return this.paths;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaths(Map<City, Integer> m) {
        this.paths = m;
    }

    public void addPath(City city, int cost) {
        paths.put(city, cost);
    }

    @Override
    public String toString() {
        String res = "";
        res += "Город: ";
        res += this.name;
        res += "\n";
        res += "Пути: ";
        for (Map.Entry<City, Integer> entry : paths.entrySet()) {
            res += entry.getKey().name;
            res += ":";
            res += entry.getValue();
            res += "\n";
        }
        return res;
    }
}