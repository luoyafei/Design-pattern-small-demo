public interface ICattle{
	public boolean isCow = false;
	public int age = 0;
	public int procreateCount = 0;
	public boolean canProcreate(boolean isCow, int age);
	public int addProcreateCount(boolean canProcreate);
}