package com.company;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;


public class CreateJSONFile {
    @SuppressWarnings("unchecked")

    public static void main(String[] args) {

        //First Patient
        JSONObject patient1 = new JSONObject();
        patient1.put("firstName", "Koby");
        patient1.put("lastName", "Corrigan");
        patient1.put("age", "28");

        JSONObject patientObj1 = new JSONObject();
        patientObj1.put("patient", patient1);

        //Second Patient
        JSONObject patient2 = new JSONObject();
        patient2.put("firstName", "Junior");
        patient2.put("lastName", "Lawson");
        patient2.put("age", "35");

        JSONObject patientObj2 = new JSONObject();
        patientObj2.put("patient2", patient2);

        //Third Patient
        JSONObject patient3 = new JSONObject();
        patient3.put("firstName", "Keeva");
        patient3.put("lastName", "Devilla");
        patient3.put("age", "23");
        JSONObject patientObj3 = new JSONObject();
        patientObj3.put("patient3", patient3);


        //Add patient to list
        JSONArray patientList = new JSONArray();
        patientList.add(patientObj1);
        patientList.add(patientObj2);
        patientList.add(patientObj3);


        //Write JSON file
        try (FileWriter file = new FileWriter("Patients.json")) {
            // we can write any JSONArray or JSONObject instance to file
            file.write(patientList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("Patients.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray patientLst = (JSONArray) obj;
            System.out.println(patientList);

            //Iterate over patient array
            patientList.forEach(emp -> parsePatientObj1((JSONObject) emp));
            patientList.forEach(emp -> parsePatientObj2((JSONObject) emp));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parsePatientObj1(JSONObject patient) {
        //Get patient object within list
        JSONObject patientObj1 = (JSONObject) patient.get("patient");

        //Get patient first name
        String firstName = (String) patientObj1.get("firstName");
        System.out.println(firstName);

        //Get patient first name
        String lastName = (String) patientObj1.get("lastName");
        System.out.println(lastName);

        //Get patient age
        String age = (String) patientObj1.get("age");
        System.out.println(age);
    }

    private static void parsePatientObj2(JSONObject patient2) {
        //Get patient object within list
        JSONObject patientObj2 = (JSONObject) patient2.get("patient2");

        //Get patient first name
        String firstName = (String) patientObj2.get("firstName");
        System.out.println(firstName);

        //Get patient first name
        String lastName = (String) patientObj2.get("lastName");
        System.out.println(lastName);

        //Get patient age
        String age = (String) patientObj2.get("age");
        System.out.println(age);
    }
}




