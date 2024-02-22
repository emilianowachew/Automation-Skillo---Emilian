package UprajneniqLekciq4;

public class CarExcersise {


            private String name;

            private String color;

            private int releaseYear;

            private int horsePower;

            private boolean secondHand;

            public CarExcersise(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
                this.name = name;
                this.color = color;
                this.releaseYear = releaseYear;
                this.horsePower = horsePower;
                this.secondHand = secondHand;
            }

            public CarExcersise(String name, String color, boolean secondHand) {
                this(name, color, -1, -1, secondHand);
            }

            public CarExcersise(String name, String color, int releaseYear, int horsePower) {
                this(name, color, releaseYear, horsePower,false);
            }
    public static void main(String[] args) {

        }
    }
