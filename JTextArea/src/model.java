public class model {
    private String vanban;
    private String tukhoa;
    private String kq;

    public model()
    {
       vanban= "";
       tukhoa  ="";
       kq = "";
    }

    public String getVanban() {
        return vanban;
    }

    public void setVanban(String vanban) {
        this.vanban = vanban;
    }

    public String getTukhoa() {
        return tukhoa;
    }

    public void setTukhoa(String tukhoa) {
        this.tukhoa = tukhoa;
    }

    public String getKq() {
        return kq;
    }

    public void setKq(String kq) {
        this.kq = kq;
    }
   
    public void dem()
    {
        int dem = 0;
        int vitri = 0;
        while(true)
        {
            int i = this.vanban.indexOf(this.tukhoa, vitri);
            if(i == -1)
            {
                break;
            }
            dem++;
            vitri = i+1;
        }
        this.kq = "Ket qua : co " + dem + " " + "<" +  this.tukhoa +">";
    }
    
}