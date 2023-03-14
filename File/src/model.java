public class model {
    private String data;
    private String filename;

    public model()
    {
        this.data = "";
        this.filename = "";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
