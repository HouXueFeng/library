package cn.xapi.hou.po;

import java.util.List;

public class Readerinfo {
    private Integer readerno;

    private String readerpassword;

    private String phone;

    private String readername;

    private String readermajor;

    public Integer getReaderno() {
		return readerno;
	}

	public void setReaderno(Integer readerno) {
		this.readerno = readerno;
	}

	public String getReaderpassword() {
        return readerpassword;
    }

    public void setReaderpassword(String readerpassword) {
        this.readerpassword = readerpassword == null ? null : readerpassword.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getReadername() {
        return readername;
    }

    public void setReadername(String readername) {
        this.readername = readername == null ? null : readername.trim();
    }

    public String getReadermajor() {
        return readermajor;
    }

    public void setReadermajor(String readermajor) {
        this.readermajor = readermajor == null ? null : readermajor.trim();
    }

	@Override
	public String toString() {
		return "Readerinfo [readerno=" + readerno + ", readerpassword=" + readerpassword + ", phone=" + phone
				+ ", readername=" + readername + ", readermajor=" + readermajor + "]";
	}



	

    
}