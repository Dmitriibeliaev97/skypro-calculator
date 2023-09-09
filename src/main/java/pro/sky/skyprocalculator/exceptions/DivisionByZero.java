package pro.sky.skyprocalculator.exceptions;

public class DivisionByZero extends IllegalArgumentException {
    public DivisionByZero(String massage) {
        super(massage);
    }
}
