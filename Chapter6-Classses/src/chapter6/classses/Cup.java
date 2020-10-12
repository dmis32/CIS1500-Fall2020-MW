package chapter6.classses;

public class Cup {

    private int maxCapacityInMililiters;
    private int currentVolumeInMililiters;
    private String color;
    
    public Cup()
    {
        maxCapacityInMililiters = 0;
        currentVolumeInMililiters = 0;
        color = "";
    }

    public int getMaxCapacityInMililiters() {
        return maxCapacityInMililiters;
    }

    public void setMaxCapacityInMililiters(int maxCapacityInMililiters) {
        if (maxCapacityInMililiters < 0) {
            maxCapacityInMililiters = 0;
        } else {
            this.maxCapacityInMililiters = maxCapacityInMililiters;
        }
    }
    
    public int getCurrentVolumeInMililiters()
    {
        return currentVolumeInMililiters;
    }
    
    public void pour(int mililitersToAdd)
    {
        currentVolumeInMililiters += mililitersToAdd;
        
        if ( currentVolumeInMililiters > maxCapacityInMililiters)
        {
            currentVolumeInMililiters = maxCapacityInMililiters;
        }
    }
    
    public void drink(int mililitersToDrink)
    {
        currentVolumeInMililiters -= mililitersToDrink;
        
        if ( currentVolumeInMililiters < 0)
        {
            currentVolumeInMililiters = 0;
        }
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
}
