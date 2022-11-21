package nhl69.luansapp.quanlycayxanh;

public class Cay {

    private String tenkh, tentg, dactinh, maula;
    int hinh;

    public Cay(String tenkh, String tentg, String dactinh, String maula, int hinh) {
        this.tenkh = tenkh;
        this.tentg = tentg;
        this.dactinh = dactinh;
        this.maula = maula;
        this.hinh = hinh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }

    public String getDactinh() {
        return dactinh;
    }

    public void setDactinh(String dactinh) {
        this.dactinh = dactinh;
    }

    public String getMaula() {
        return maula;
    }

    public void setMaula(String maula) {
        this.maula = maula;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
