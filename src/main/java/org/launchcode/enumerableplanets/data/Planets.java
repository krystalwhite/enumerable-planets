package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("Mercury", 88, 0),
    VENUS ("Venus", 225, 0),
    EARTH ("Earth", 365, 1),
    MARS ("Mars", 687, 2),
    JUPITER ("Jupiter", 4333, 79),
    SATURN ("Saturn", 10759, 82),
    URANUS ("Uranus", 30687, 27),
    NEPTUNE ("Neptune", 60200, 14);

    private String name;
    private int yearLength;
    private int numMoons;

    Planets(String name, int yearLength, int numMoons) {
        this.name = name;
        this.yearLength = yearLength;
        this.numMoons = numMoons;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public int getNumMoons() {
        return numMoons;
    }
}
