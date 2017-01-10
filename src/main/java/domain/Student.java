package domain;

import json.*;

import java.util.ArrayList;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class Student extends BasicStudent {

    private String name;
    private String surname;
    private Integer year;
    private ArrayList<Tuple<String, Integer>> exams;

    public Student(String name, String surname, Integer year, Tuple<String, Integer>... exams) {
        // ToDo
        this.name = name;
        this.surname = surname;
        this.year = year;
        for(Tuple exam: exams){
            this.exams.add(exam);
        }

    }

    @Override
    public JsonObject toJsonObject() {
        // ToDo
        JsonPair name = new JsonPair("name", new JsonString(this.name));
        JsonPair surname = new JsonPair("surname", new JsonString(this.surname));
        JsonPair year = new JsonPair("year", new JsonNumber(this.year));
        Json jMarks = new JsonArray();
        JsonPair exams = new JsonPair("exams", jMarks);
        JsonObject jsonObject = new JsonObject(name, surname, year, exams);

        return jsonObject;
    }
}