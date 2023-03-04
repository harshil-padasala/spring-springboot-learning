package StandAloneCollections;

import java.util.List;

public class State {

    private String name;
    private List<String> cities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }
}
