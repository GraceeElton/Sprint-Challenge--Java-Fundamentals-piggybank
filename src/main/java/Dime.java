package main.java;

public class Dime extends Money
{


    public Dime(String name, int count)
    {
        super(name, count);
        faceValue = 0.10;
    }



    @Override
    public String strValue()
    {
        return count + " Dime";
    }

    @Override
    public String strValueMany()
    {
        if (this.count > 1)
        {
            return count + " Dimes";
        } else
        {
            return strValue();
        }
    }

}
