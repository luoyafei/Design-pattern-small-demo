import java.util.ArrayList;

public class Cattle implements ICattle {

	private int age = 0;
	private ArrayList<Cattle> procreateCount = null;
	
	public Cattle(int age) {
		this.age = age;
		procreateCount = new ArrayList<Cattle>();
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<Cattle> getProcreateCount() {
		return procreateCount;
	}
	public void setProcreateCount(ArrayList<Cattle> procreateCount) {
		this.procreateCount = procreateCount;
	}

	@Override
	public void born(Cattle cattle) {

		Cattle c = new Cattle(1);
		cattle.getProcreateCount().add(c);
	}
	
	@Override
	public void addAge(Cattle cattle) {
		
		/*if(cattle.getProcreateCount().size() == 0)
			return 0;*/
		
		cattle.setAge(cattle.getAge() + 1);
		
		if(cattle.getAge() >= 5) {
			born(cattle);
		}
		for(int i = 0; i < cattle.getProcreateCount().size(); i++) {
			Cattle c = cattle.getProcreateCount().get(i);
			if(c != null)
				addAge(c);
		}
	}
}