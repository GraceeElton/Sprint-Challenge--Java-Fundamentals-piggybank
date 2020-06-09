package main.java;

public class Penny extends Money
{


    public Penny(String name, int count)
    {
        super(name, count);
        faceValue = 0.01;
    }



    @Override
    public String strValue()
    {
        return count + " Penny";
    }

    @Override
    public String strValueMany()
    {
        if (this.count > 1)
        {
            return count + " Pennies";
        } else
        {
            return strValue();
        }
    }
}
