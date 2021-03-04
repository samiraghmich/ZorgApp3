package com.company;

public class Patient {
    private String surname;
    private String lastname;
    private int age;
    private double weight;
    private double length;
    private String bmi;

//    Set function
    public void setSurname(String surnameGiven){
        surname = surnameGiven;
    }

    public void setLastname(String lastnameGiven) {
        lastname = lastnameGiven;
    }

    public void setAge(int ageGiven){
        age = ageGiven;
    }

    public void setAge(String ageGiven){
        age = Integer.parseInt(ageGiven);
    }

    public void setWeight(double weightGiven) {
        weight = weightGiven;
    }

    public void setLength(double lengthGiven){
        length = lengthGiven;
    }

    public void setBmi(String bmiGiven){
        bmi = bmiGiven;
    }

//  Get function
    public String getSurname(){
        return surname;
    }

    public String getLastname(){
        return lastname;
    }

    public int getAge (){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public double getLength(){
        return length;
    }

    public String getBmi(){
        return bmi;
    }

//    BMI Calculator
public double calcBmi(){
    double BMI = this.weight / this.length / this.length * 1000;
    return BMI;
}



    public Patient(String PatientsSurname, String PatientsLastname, int PatientsAge, double PatientsWeight, double PatientsLength, String PatientsBMI) {
        surname = PatientsSurname;
        lastname = PatientsLastname;
        age = PatientsAge;
        weight = PatientsWeight;
        length = PatientsLength;
        bmi= PatientsBMI;
    }

    public Patient(String PatientsSurname, String PatientsLastname) {
        surname = PatientsSurname;
        lastname = PatientsLastname;
    }

    public void writeln(){
        System.out.println(surname + " " + lastname);
    }

    public void writeInformation(){
    System.out.println(surname + " " + lastname + "\n" + age + "\n" + weight + " kg" + "\n" + length + " cm" + "\n" + bmi);
}

}
