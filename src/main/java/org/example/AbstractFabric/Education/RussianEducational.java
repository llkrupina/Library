package org.example.AbstractFabric.Education;

import org.example.AbstractFabric.Book;
import org.example.AbstractFabric.Russian;

import java.util.ArrayList;
import java.util.Random;

public class RussianEducational extends Book implements Russian {
    String type;
    String title;
    public  RussianEducational() {

        ArrayList<String> literatureType = new ArrayList<>();
        literatureType.add("учебник");
        literatureType.add("пособие");
        literatureType.add("задачник");
        setRandomType(literatureType);

        ArrayList<String> russiandiscipline = new ArrayList<>();
        russiandiscipline.add("Обработка данных");
        russiandiscipline.add("Теория тепломассообмена");
        russiandiscipline.add("Теплофизика и теоретическая теплотехника");
        russiandiscipline.add("Наука о данных");
        russiandiscipline.add("Программная инженерия");
        russiandiscipline.add("Искусственный интеллект");
        russiandiscipline.add("Компьютерная графика");
        russiandiscipline.add("Кибербезопасность");
        russiandiscipline.add("Цифровой маркетинг");
        russiandiscipline.add("Веб-разработка");
        russiandiscipline.add("Разработка мобильных приложений");
        russiandiscipline.add("Дизайн игр");
        russiandiscipline.add("Администрирование сетей");
        russiandiscipline.add("Криптография");
        russiandiscipline.add("Управление базами данных");
        russiandiscipline.add("Облачные вычисления");
        russiandiscipline.add("Взаимодействие человека с компьютером");
        russiandiscipline.add("Операционные системы");
        russiandiscipline.add("Теория информации");
        russiandiscipline.add("Робототехника");
        russiandiscipline.add("Дизайн пользовательского опыта");
        russiandiscipline.add("Компьютерное зрение");
        russiandiscipline.add("Обработка естественного языка");
        russiandiscipline.add("Анализ данных");
        russiandiscipline.add("Тестирование программного обеспечения");
        russiandiscipline.add("Квантовые вычисления");
        russiandiscipline.add("Биоинформатика");
        russiandiscipline.add("Интернет вещей (IoT)");
        setRandomTitle(russiandiscipline);


    }

    public String getType() {
        return this.type;
    }

    public String getTitle(){
        return this.title;
    }

    public void setRandomType(ArrayList<String> literatureType) {
        Random random = new Random();
        int index = random.nextInt(literatureType.size());
        this.type = literatureType.get(index);
    }

    public void setRandomTitle(ArrayList<String> russiandiscipline) {
        Random random = new Random();
        int index = random.nextInt(russiandiscipline.size());
        this.title = russiandiscipline.get(index);
    }
    @Override
    public String GetFullDiscription(){
        String j = "(" + this.type + ")" + " " + this.title;
        return j;
    }
}
