package cn.xapi.hou.po;

import java.util.Date;

public class Borrow {
    private Integer borrowid;

    private Date outtime;

    private Date intime;

    private Integer callno;

    private Integer readerno;

    private Bookinfo bookinfo;
    private Readerinfo readerinfo;
	public Integer getBorrowid() {
		return borrowid;
	}
	public void setBorrowid(Integer borrowid) {
		this.borrowid = borrowid;
	}
	public Date getOuttime() {
		return outtime;
	}
	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}
	public Date getIntime() {
		return intime;
	}
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	public Integer getCallno() {
		return callno;
	}
	public void setCallno(Integer callno) {
		this.callno = callno;
	}
	public Integer getReaderno() {
		return readerno;
	}
	public void setReaderno(Integer readerno) {
		this.readerno = readerno;
	}
	public Bookinfo getBookinfo() {
		return bookinfo;
	}
	public void setBookinfo(Bookinfo bookinfo) {
		this.bookinfo = bookinfo;
	}
	public Readerinfo getReaderinfo() {
		return readerinfo;
	}
	public void setReaderinfo(Readerinfo readerinfo) {
		this.readerinfo = readerinfo;
	}
	@Override
	public String toString() {
		return "Borrow [borrowid=" + borrowid + ", outtime=" + outtime + ", intime=" + intime + ", callno=" + callno
				+ ", readerno=" + readerno + ", bookinfo=" + bookinfo + ", readerinfo=" + readerinfo + "]";
	}
    
    


    
    
}