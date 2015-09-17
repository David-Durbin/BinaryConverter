package com.example;

public class MyClass
{

    public static void main(String[] args)
    {

        int r = 1110010;
        int y = 1111001;
        int e = 1100101;

        System.out.println("Try the " + (char) convert(r) + (char) convert(y) + (char) convert(e)
        + " or the Keiser! Maybe I can suggest and appetizer!");

        convert(y);
    }

    public static int convert(int r)
    {
        int n = 0, rem, decimal = 0;

        while (r != 0)
        {

            rem = r % 10;
            r /= 10;
            decimal += rem << n;
            ++n;

        }

        return decimal;
    }

}
