package main.java;

public class Quarter extends Money
{
    public String name;

    public Quarter(String name, int count)
    {
        super(name, count);
        faceValue = 0.25;
    }



    @Override
    public String strValue()
    {
        return count + " Quarter";
    }

    @Override
    public String strValueMany()
    {
        if (this.count > 1)
        {
            return count + " Quarters";
        } else
        {
            return strValue();
        }
    }
}
