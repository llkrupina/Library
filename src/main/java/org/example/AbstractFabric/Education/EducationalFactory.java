package org.example.AbstractFabric.Education;

import org.example.AbstractFabric.*;

public class EducationalFactory implements BookFactory {
    @Override
    public English createEnglish() {
        return new EnglishEducational();
    }
    @Override
    public Russian createRussian() {
        return new RussianEducational();
    }

}
