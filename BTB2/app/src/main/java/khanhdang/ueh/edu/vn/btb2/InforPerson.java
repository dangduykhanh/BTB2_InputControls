package khanhdang.ueh.edu.vn.btb2;

import java.io.Serializable;

public class InforPerson implements Serializable {
    private String hovaten;
    private String sodienthoai;
    private String gioitinh;
    private String trinhdo;
    private int tuoi;
    private String thethao;
    private String theloaiamnhac;

    public String getHovaten() {
        return hovaten;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getThethao() {
        return thethao;
    }

    public String getTheloaiamnhac() {
        return theloaiamnhac;
    }

    public InforPerson(String hovaten, String sodienthoai, String gioitinh, String trinhdo,
                       int tuoi, String thethao, String theloaiamnhac) {
        this.hovaten = hovaten;
        this.sodienthoai = sodienthoai;
        this.gioitinh = gioitinh;
        this.trinhdo = trinhdo;
        this.tuoi = tuoi;
        this.thethao = thethao;
        this.theloaiamnhac = theloaiamnhac;
    }

}
