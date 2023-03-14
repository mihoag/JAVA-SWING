import java.util.ArrayList;

public class model {
    private String monchinh;
    private ArrayList<String> monphu;
    private int tongtien;

    public model()
    {
        monchinh = "";
        monphu = new ArrayList<String>();
        tongtien = 0;
    }

    public String getMonchinh() {
        return monchinh;
    }

    public void setMonchinh(String monchinh) {
        this.monchinh = monchinh;
    }

    public ArrayList<String> getMonphu() {
        return monphu;
    }

    public void setMonphu(ArrayList<String> monphu) {
        this.monphu = monphu;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }
    
    public void tinhTongtien()
    {
        int sum = 0;
        String mc = this.getMonchinh();
        if(mc.equals("COM"))
           {
             sum += 25000;
           }
        else if(mc.equals("BUN"))
        {
            sum += 20000;
        }
        else if(mc.equals("PHO"))
        {
            sum += 35000;
        }

        for(String s : monphu)
         {
            if(s.equals("Trai cay"))
            {
                sum += 10000;
            }
            else if(s.equals("Nuoc ngot"))
            {
                sum += 8000;
            }
            else if(s.equals("Sua chua"))
            {
                sum += 6;
            }
         }
        tongtien = sum;
    }
    

}
