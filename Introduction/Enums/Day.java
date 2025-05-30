package Enums;

public enum Day {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THRUSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    private final int dayNumber;

    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }
    public int getDayNumber(){
        return this.dayNumber;
    }
}
