package model;

public class City extends Location {

    public City(String name, String voivodeship) {
        super(name, voivodeship, LocationType.CITY);
    }

    @Override
    public String sayGreeting() {
        return  "Welcome to " + super.getName() + " " + super.getType();
    }
}
