public class Cattle implements ICattle {
	
	public boolean isCow;
	public int age;
	public int procreateCount;
	
	@Override
	public boolean canProcreate(boolean isCow, int age) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int addProcreateCount(boolean canProcreate) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		
		System.out.println("Hello World");
	}
}