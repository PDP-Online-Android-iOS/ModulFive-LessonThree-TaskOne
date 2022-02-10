package dev.ogabek.java.model;

public class User {
    private final int image;
    private final String name;
    private final String last;

    public User(int image, String name, String last) {
        this.image = image;
        this.name = name;
        this.last = last;
    }

    public User(int image, String name) {
        this.image = image;
        this.name = name;
        this.last = "Last seen recently";
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getLast() {
        return last;
    }
}
