public class CalculateCattles {


	public static int count = 0;
	public static void main(String[] args) {
		
		Cattle first = new Cattle(1);
		
		for (int i = 2; i <= 20; i++) {
			first.addAge(first);
		}
		
		
		getCount(first);
		
		System.out.println(count);
	}
	
	public static void getCount(Cattle cattle) {

		if(cattle != null)
			++count;
		for(int i = 0; i < cattle.getProcreateCount().size(); i++) {
			getCount(cattle.getProcreateCount().get(i));
		}
	}

}
