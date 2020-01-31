class Wheel {
	private int rim;
	private double tire;
	Wheel(int rim,double tire)
	{
		this.rim = rim;
		this.tire = tire;
	}
	public int getRim()
	{
		return this.rim;
	}
	public double getTire()
	{
		return this.tire;
	}
	public double diameter()
	{
		return rim + (tire*2);
	}
	public double circumference()
	{
		return this.diameter()*(3.14);
	}
}
class Gear {
	private Wheel wheel;
	private int chianring,cog;
	Gear(int chianring,int cog,int rim,double tire)
	{
		this.chianring=chianring;
		this.cog=cog;
		wheel = new Wheel(rim,tire);
	}
	public double ratio()
	{
		return chianring/(1.0 * cog);
	}
	public double gear_inches()
	{
		return this.ratio() * wheel.diameter();
	}
}
class Main_5 {
	public static void main(String[] args) {
		Gear gear = new Gear(52,11,26,1.5);
		Wheel wheel = new Wheel(26,1.5);
		System.out.println(wheel.circumference());
		System.out.println(gear.ratio());
		System.out.println(gear.gear_inches());
	}
}