class Wheel {
	private int rim;
	private double tire;
	private Gear gear;
	Wheel(int rim,double tire,Gear gear)
	{
		this.rim = rim;
		this.tire = tire;
		this.gear = gear;
	}
	public double diameter()
	{
		return rim + (tire*2);
	}
	public double gear_inches()
	{
		return gear.gear_inches(this.diameter());
	}
}
class Gear {
	private int chianring,cog;
	Gear(int chianring,int cog)
	{
		this.chianring=chianring;
		this.cog=cog;
	}
	public double ratio()
	{
		return chianring/(1.0 * cog);
	}
	public double gear_inches(double diameter)
	{
		return this.ratio() * diameter;
	}
}
class Main_8 {
	public static void main(String[] args) {
		Gear gear = new Gear(52,11);
		Wheel wheel = new Wheel(26,1.5,gear);
		System.out.println(wheel.gear_inches());
	}
}