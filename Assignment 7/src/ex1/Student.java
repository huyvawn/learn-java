package ex1;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {
	private static AtomicInteger count = new AtomicInteger(0);
	int id;
	String name;
	boolean trungten = false;
	public Student( String name) {
		
		id = count.incrementAndGet();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	void setTrungten() {
		trungten = true;
	}
	
}
