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
	Gear(int chianring,int cog,Wheel wheel)
	{
		this.chianring=chianring;
		this.cog=cog;
		this.wheel = wheel;
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
class Main_6 {
	public static void main(String[] args) {
		Wheel wheel = new Wheel(26,1.5);
		Gear gear = new Gear(52,11,wheel);
		System.out.println(wheel.circumference());
		System.out.println(gear.ratio());
		System.out.println(gear.gear_inches());
	}
}