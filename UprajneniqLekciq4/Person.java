package UprajneniqLekciq4;

public class Person {
    private final String name;
    private final char gender;
    private final String religion;
    private final String languageSpoken;
    private String job;
    private final String nationality;
    private final String egn;
    private final String dateOfBirth;
    private final String age;
    private String countryOfResidence;


    public Person(String name, char gender, String religion,
                  String languageSpoken, String job, String nationality, String egn,
                  String countryOfResidence) {
        this.name = name;
        this.gender = gender;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        this.egn = egn;
        this.countryOfResidence = countryOfResidence;

    }

}
