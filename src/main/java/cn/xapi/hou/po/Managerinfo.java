package cn.xapi.hou.po;

public class Managerinfo {
    private Integer mangno;

    private String mangname;

    private String mangpassword;

    public Integer getMangno() {
        return mangno;
    }

    public void setMangno(Integer mangno) {
        this.mangno = mangno;
    }

    public String getMangname() {
        return mangname;
    }

    public void setMangname(String mangname) {
        this.mangname = mangname == null ? null : mangname.trim();
    }

    public String getMangpassword() {
        return mangpassword;
    }

    public void setMangpassword(String mangpassword) {
        this.mangpassword = mangpassword == null ? null : mangpassword.trim();
    }
}