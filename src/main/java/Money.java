package main.java;

public abstract class Money
{
    public int count = 1;
    public String name;
    public double faceValue;

    public Money(String name, int count)
    {
        this.count = count;
        this.name = name;
    }

    // getter
    public String getName()
    {
        return name;
    }

    public double getValue()
    {

        // 0.25 * 7 dollars
        return faceValue * count;
    }


    public double getFaceValue()
    {
        // how much the coin is worth
        return faceValue;
    }

    public int getCount()
    {
        // how many coins are in the piggy bank
        return count;
    }

    // setters

    public abstract String strValue();
    public abstract String strValueMany();
}
