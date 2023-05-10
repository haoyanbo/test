package org.example;

public class Jedi {
    private String name;
    private String species;
    boolean b;
    Jedi(String name, String species) {
        this(name, species, false);
    }
    Jedi(String name, String species, boolean b) {
        this.name = name;
        this.species = species;
        this.b = b;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
}
