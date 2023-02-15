package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
private int Eid;
private String Ename;
@Id
public int getEid() {
	return Eid;
}

public void setEid(int eid) {
	Eid = eid;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
}
