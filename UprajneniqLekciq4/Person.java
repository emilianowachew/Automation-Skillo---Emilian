package UprajneniqLekciq4;

public class Person {
    protected final String name;
    protected final String gender;
    protected final String language;
    protected String job;
    protected final String nationality;
    protected final String egn;
    protected final String dateOfBirth;

    protected final String religion;
    protected String countryOfResidence;
    protected final int age;

    public Person(String name, char gender, String religion,
                  String language, String job, String nationality, String egn,
                  String countryOfResidence) {
        this.name = name;
        this.gender = gender;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.egn = egn;
        this.countryOfResidence = countryOfResidence;
        this.age = calculateAge(this.egn);
        this.dateOfBirth = calculateBirthDay(egn);



    }
    public Person(String name, String gender, String language, String nationality, String egn, String religion, String countryOfResidence){
        this(name, gender, language, job:null, nationality, egn, countryOfResidence, religion);
    }
    public void checkEGN(String egn){
        int egnLength = egn.length();
        if(!(egnLength == 10 && egn.matches("\\d+"))){
            throw new RuntimeException("The EGN must be exactly 10 digits.");
        }
    }
    public String getGender(String gender) {
        if (gender == "Female" || gender == "Male"){
            return gender;
        } else {
            System.out.pritnln("Invalid gender provided!");
            return "Female";
        }
    }
    private int calculateAge(String egn){
        String birthYearString;
        int currentYear = LocalDate.now().getYear();
        String yearDigits = egn.substring(0, 2);
        String monthDigits = egn.substring(2, 4);
        int monthDigitsInt = Integer.parseInt(monthDigits);
        if (monthDigitsInt > 40) {
            birthYearString = "20" + yearDigits;
        } else{
            birthYearString = "19" + yearDigits;
        }
        int birthYear = Integer.parseInt(birthYearString);
        return  currentYear - birthYear;
    }
    private String calculateBirthDay(String egn){
        String monthDigits = egn.substring(2, 4);
        String dayDigits = egn.substring(4, 6);

        int monthDigitsInt = Integer.parseInt(monthDigits);
        int monthNumber = monthDigitsInt;
    }

}
