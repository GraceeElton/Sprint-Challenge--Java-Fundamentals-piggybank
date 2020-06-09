package main.java;

public class Dollar extends Money
{

    public Dollar(String name, int count)
    {
        super(name, count);
        faceValue = 1.00;
    }

    @Override
    public String strValue()
    {
        return   "$ " + count + " Dollar";
    }

    @Override
    public String strValueMany()
    {
        if (this.count > 1)
        {
            return "$ " + count + " Dollars";
        } else
        {
            return strValue();
        }
    }
}
