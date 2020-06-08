package main.java;

public class Nickle extends Money
{


    public Nickle(String name, int count)
    {
        super(name, count);
        faceValue = 0.05;
    }



    @Override
    public String strValue()
    {
        return count + " Nickle";
    }

    @Override
    public String strValueMany()
    {
        if (this.count > 1)
        {
            return count + " Nickles";
        } else
        {
            return strValue();
        }
    }
}
