public class model {
    private double ans;
    public model()
    {
        this.ans = 0;
    }
    public void cong(double x, double y)
    {
        this.ans = x + y;
    }
    public void tru(double x, double y)
    {
        this.ans = x - y;
    }
    public void nhan(double x, double y)
    {
        this.ans = x*y;
    }
    public void chia(double x, double y)
    {
        this.ans = x/y;
    }
    public void mod(double x, double y)
    {
        this.ans = (int)x % (int)y;
    }
    public void mu(double x, double y)
    {
        this.ans = Math.pow(x, y);
    }
    public double getAns()
    {
        return this.ans;
    }
}
