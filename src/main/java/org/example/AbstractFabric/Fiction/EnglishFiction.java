package org.example.AbstractFabric.Fiction;

import org.example.AbstractFabric.English;
import org.example.AbstractFabric.Book;

import java.util.ArrayList;
import java.util.Random;

public class EnglishFiction extends Book implements English {
    String title;
    public  EnglishFiction() {
        ArrayList<String> englishfiction = new ArrayList<>();
        englishfiction.add("To Kill a Mockingbird by Harper Lee");
        englishfiction.add("1984 by George Orwell");
        englishfiction.add("The Great Gatsby by F. Scott Fitzgerald");
        englishfiction.add("Pride and Prejudice by Jane Austen");
        englishfiction.add("The Catcher in the Rye by J.D. Salinger");
        englishfiction.add("Brave New World by Aldous Huxley");
        englishfiction.add("The Lord of the Rings by J.R.R. Tolkien");
        englishfiction.add("The Hobbit by J.R.R. Tolkien");
        englishfiction.add("The Grapes of Wrath by John Steinbeck");
        englishfiction.add("Moby-Dick by Herman Melville");
        englishfiction.add("The Picture of Dorian Gray by Oscar Wilde");
        englishfiction.add("Jane Eyre by Charlotte Brontë");
        englishfiction.add("Wuthering Heights by Emily Brontë");
        englishfiction.add("Frankenstein by Mary Shelley");
        englishfiction.add("The Adventures of Huckleberry Finn by Mark Twain");
        englishfiction.add("Alice's Adventures in Wonderland by Lewis Carroll");
        englishfiction.add("One Hundred Years of Solitude by Gabriel García Márquez");
        englishfiction.add("The Bell Jar by Sylvia Plath");
        englishfiction.add("The Scarlet Letter by Nathaniel Hawthorne");
        englishfiction.add("The Canterbury Tales by Geoffrey Chaucer");
        setRandomTitle(englishfiction);
    }

    @Override
    public String getTitle() {
        return this.title;
    }
    public void setRandomTitle(ArrayList<String> englishfiction) {
        Random random = new Random();
        int index = random.nextInt(englishfiction.size());
        this.title = englishfiction.get(index);
    }

    @Override
    public String GetFullDiscription(){
        String j = this.title;
        return j;
    }


}
