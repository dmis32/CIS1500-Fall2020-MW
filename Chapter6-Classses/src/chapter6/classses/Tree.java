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

    public int getHeight() {
        return heightInCentimeters;
    }

    public int getGrowthInCentimetersPerYear() {
        return growthInCentimetersPerYear;
    }

    public void setGrowthInCentimetersPerYear(int growthInCentimetersPerYear) {
        this.growthInCentimetersPerYear = growthInCentimetersPerYear;
    }

    public String toString() {
        return "Tree type: " + type + " Height (cm): " + heightInCentimeters
                + " Age: " + age;
    }
}
