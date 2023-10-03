package june20;


class Mobile{
	private int storage=16;
	
	public int getStorage() {
		return storage;
	}
	
	public void setStorage(int storage) {
		this.storage=storage;
	}
	
	public String toString() {
		return "Mobile";
	}
}

public class Test1 {
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		System.out.println(obj);
	}
}
