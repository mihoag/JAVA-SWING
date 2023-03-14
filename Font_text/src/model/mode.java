package model;

public class mode {
    private int button;

    public mode()
    {
        this.button = 0;
    }
    public void change_1()
    {
        this.button = 1;
    }
    public void change_2()
    {
        this.button = 2;
    }
    public void change_3()
    {
        this.button = 3;
    }
    public void change_4()
    {
        this.button = 4;
    }

    public int getValue()
    {
       return this.button;
    }
}
