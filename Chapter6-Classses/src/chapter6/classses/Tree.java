package chapter6.classses;

public class Tree {

    private String type;
    private int age;
    private int growthInCentimetersPerYear;
    private int heightInCentimeters;

    public Tree(String type) {
        this.type = type;
        age = 0;
        growthInCentimetersPerYear = 0;
        heightInCentimeters = 0;
    }

    public Tree(String type, int age, int growthInCentimetersPerYear) {
        // this might be silly, but it's just an example
        this(type);
        setGrowthInCentimetersPerYear(growthInCentimetersPerYear);
        grow(age);
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void grow() {
        age++;
        heightInCentimeters += growthInCentimetersPerYear;
    }

    public void grow(int yearsToGrow) {
        if (yearsToGrow > 0) {
            age += yearsToGrow;
            heightInCentimeters += yearsToGrow * growthInCentimetersPerYear;
        }

        // this is an option
        // for ( int year = 0; year < yearsToGrow; year++)
        // {
        //    grow();
        // }
    }

    public void grow(String yearsToGrow) {
        grow(Integer.parseInt(yearsToGrow));
    }

    public int getHeight() {
        return heightInCentimeters;
    }

    public int getGrowthInCentimetersPerYear() {
        return growthInCentimetersPerYear;
    }

    public void setGrowthInCentimetersPerYear(int growthInCentimetersPerYear) {
        if (growthInCentimetersPerYear > 0) {
            this.growthInCentimetersPerYear = growthInCentimetersPerYear;
        } else {
            this.growthInCentimetersPerYear = 0;
        }
    }

    @Override
    public String toString() {
        return "Tree type: " + type + " Height (cm): " + heightInCentimeters
                + " Age: " + age;
    }
}
