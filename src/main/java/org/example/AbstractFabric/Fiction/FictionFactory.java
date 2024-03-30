package org.example.AbstractFabric.Fiction;

import org.example.AbstractFabric.*;

public class FictionFactory extends Book implements BookFactory {
    @Override
    public English createEnglish() {
        return new EnglishFiction();
    }
    @Override
    public Russian createRussian() {
        return new RussianFiction();
    }
}
