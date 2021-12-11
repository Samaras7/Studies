package utils;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Student {
    protected String surname;

    public abstract double average();
}
