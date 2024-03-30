package org.example;

import org.example.AbstractFabric.*;

import java.util.ArrayList;

import org.example.AbstractFabric.Education.EducationalFactory;
import org.example.AbstractFabric.Education.EnglishEducational;
import org.example.AbstractFabric.Education.RussianEducational;
import org.example.AbstractFabric.Fiction.EnglishFiction;
import org.example.AbstractFabric.Fiction.FictionFactory;
import org.example.AbstractFabric.Fiction.RussianFiction;


public class Library {
    private ArrayList<Book> library = new ArrayList<>();

    public ArrayList<Book> getLibrary() {
        return library;
    }

    public Library() {
        createEducationalBooks(15, "English");
        createEducationalBooks(15, "Russian");
        createFictionBooks(15, "Russian");
        createFictionBooks(15, "English");

    }
    public void createEducationalBooks(int numberOfBooks, String bookType) {
        BookFactory educatedFactory;
        educatedFactory = new EducationalFactory();

        for (int i = 0; i < numberOfBooks; i++) {

            switch (bookType) {
                case "English":
                    EnglishEducational englishEducational = (EnglishEducational) educatedFactory.createEnglish();
                    library.add(englishEducational);
                    break;
                case "Russian":
                    RussianEducational russianEducational = (RussianEducational) educatedFactory.createRussian();
                    library.add(russianEducational);
                    break;
                default:
                    System.out.println("Unsupported book type");
                    break;
            }
        }
    }

    public void createFictionBooks(int numberOfBooks, String bookType) {
        BookFactory fictionFactory;
        fictionFactory = new FictionFactory();

        for (int i = 0; i < numberOfBooks; i++) {
            switch (bookType) {
                case "English":
                    EnglishFiction englishFiction = (EnglishFiction) fictionFactory.createEnglish();
                    library.add(englishFiction);
                    break;
                case "Russian":
                    RussianFiction russianFiction = (RussianFiction) fictionFactory.createRussian();
                    library.add(russianFiction);
                    break;
                default:
                    System.out.println("Unsupported book type");
                    break;
            }
        }
    }
}