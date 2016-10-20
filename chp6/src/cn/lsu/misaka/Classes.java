package cn.lsu.misaka;

public class Classes {
	private String name;
	private int ID;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Classes(String name, int iD) {
		super();
		this.name = name;
		ID = iD;
	}
	
}
