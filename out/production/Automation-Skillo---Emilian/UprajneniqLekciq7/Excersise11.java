package UprajneniqLekciq7;

public class Car {
    private String name;

    private String color;

    private int releaseYear;

    private int horsePower;

    private boolean secondHand;

    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }
    public Car(String name, String color, boolean secondHand){
        this(name, color, secondHand, releaseYear:-1, horsePower:-1)
    }
    public Car(String name, String color,int releaseYear, int horsePower){
        this(name, color, releaseYear, horsePower, secondHand:false)
    }
}
