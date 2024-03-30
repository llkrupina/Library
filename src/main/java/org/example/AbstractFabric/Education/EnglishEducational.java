package org.example.AbstractFabric.Education;

import org.example.AbstractFabric.Book;
import org.example.AbstractFabric.English;

import java.util.ArrayList;
import java.util.Random;

public class EnglishEducational extends Book implements English {
    String level;
    String title;

    public  EnglishEducational() {

        ArrayList<String> levelChoice = new ArrayList<>();
        levelChoice.add("Magistracy");
        levelChoice.add("Bachelor");
        setRandomLevel(levelChoice);

        ArrayList<String> englishdiscipline = new ArrayList<>();
        englishdiscipline.add("IBM Data Analyst");
        englishdiscipline.add("Google Data Analyst");
        englishdiscipline.add("Machine-learning");
        englishdiscipline.add("Data Science");
        englishdiscipline.add("Software Engineering");
        englishdiscipline.add("Artificial Intelligence");
        englishdiscipline.add("Computer Graphics");
        englishdiscipline.add("Cybersecurity");
        englishdiscipline.add("Digital Marketing");
        englishdiscipline.add("Web Development");
        englishdiscipline.add("Mobile App Development");
        englishdiscipline.add("Game Design");
        englishdiscipline.add("Network Administration");
        englishdiscipline.add("Cryptography");
        englishdiscipline.add("Database Management");
        englishdiscipline.add("Cloud Computing");
        englishdiscipline.add("Human-Computer Interaction");
        englishdiscipline.add("Operating Systems");
        englishdiscipline.add("Information Theory");
        englishdiscipline.add("Robotics");
        englishdiscipline.add("User Experience Design");
        englishdiscipline.add("Computer Vision");
        englishdiscipline.add("Natural Language Processing");
        englishdiscipline.add("Data Mining");
        englishdiscipline.add("Software Testing");
        englishdiscipline.add("Quantum Computing");
        englishdiscipline.add("Bioinformatics");
        englishdiscipline.add("Internet of Things (IoT)");
        setRandomTitle(englishdiscipline);

    }

    public String getLevel(){
        return this.level;
    }

    public String getTitle(){
        return this.title;
    }

    public void setRandomLevel(ArrayList<String> levelChoice) {
        Random random = new Random();
        int index = random.nextInt(levelChoice.size());
        this.level = levelChoice.get(index);
    }

    public void setRandomTitle(ArrayList<String> englishdiscipline) {
        Random random = new Random();
        int index = random.nextInt(englishdiscipline.size());
        this.title = englishdiscipline.get(index);
    }

    @Override
    public String GetFullDiscription(){
        String j = "(" + this.level + ")" + " " + this.title;
        return j;
    }


}

