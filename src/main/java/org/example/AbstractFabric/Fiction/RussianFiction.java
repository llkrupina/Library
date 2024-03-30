package org.example.AbstractFabric.Fiction;

import org.example.AbstractFabric.Book;
import org.example.AbstractFabric.Russian;

import java.util.ArrayList;
import java.util.Random;

public class RussianFiction extends Book implements Russian {

    String title;
    public  RussianFiction() {
        ArrayList<String> russianfiction = new ArrayList<>();

        russianfiction.add("Война и мир");
        russianfiction.add("Преступление и наказание");
        russianfiction.add("Анна Каренина");
        russianfiction.add("Братья Карамазовы");
        russianfiction.add("Доктор Живаго");
        russianfiction.add("Отцы и дети");
        russianfiction.add("Мастер и Маргарита");
        russianfiction.add("Бесы");
        russianfiction.add("Палата номер 6");
        russianfiction.add("Идиот");
        russianfiction.add("Дубровский");
        russianfiction.add("Собачье сердце");
        russianfiction.add("Повести Белкина");
        russianfiction.add("Мёртвые души");
        russianfiction.add("Тихий Дон");
        russianfiction.add("Золотой телёнок");
        russianfiction.add("Обломов");
        russianfiction.add("Маленький принц");
        russianfiction.add("Ревизор");
        russianfiction.add("Капитанская дочка");
        russianfiction.add("Евгений Онегин");
        russianfiction.add("Король-олень");
        russianfiction.add("Русская литература");
        setRandomTitle(russianfiction);

    }

    @Override
    public String getTitle() {
        return this.title;
    }
    public void setRandomTitle(ArrayList<String> russianfiction) {
        Random random = new Random();
        int index = random.nextInt(russianfiction.size());
        this.title = russianfiction.get(index);
    }

    @Override
    public String GetFullDiscription(){
        String j = this.title;
        return j;
    }
}
