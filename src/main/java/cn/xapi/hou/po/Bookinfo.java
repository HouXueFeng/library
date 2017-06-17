package cn.xapi.hou.po;

public class Bookinfo {
    private Integer callno;

    private String bookname;

    private String bookauther;

    private String time;

    private Double bookprice;

    private String bookobject;

    private Integer number;

    private String pic;

    private String description;

    public Integer getCallno() {
        return callno;
    }

    public void setCallno(Integer callno) {
        this.callno = callno;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getBookauther() {
        return bookauther;
    }

    public void setBookauther(String bookauther) {
        this.bookauther = bookauther == null ? null : bookauther.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Double getBookprice() {
        return bookprice;
    }

    public void setBookprice(Double bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookobject() {
        return bookobject;
    }

    public void setBookobject(String bookobject) {
        this.bookobject = bookobject == null ? null : bookobject.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	@Override
	public String toString() {
		return "Bookinfo [callno=" + callno + ", bookname=" + bookname + ", bookauther=" + bookauther + ", time=" + time
				+ ", bookprice=" + bookprice + ", bookobject=" + bookobject + ", number=" + number + ", pic=" + pic
				+ ", description=" + description + "]";
	}


    
    
}