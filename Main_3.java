class Gear {
	private int chainring,cog,rim;
	private double rat,tire;
	Gear(int chainring,int cog,int rim,double tire)
	{
		this.chainring=chainring;
		this.cog=cog;
		this.rim=rim;
		this.tire=tire;

	}
	public double ratio(){
		this.rat= ((1.0)*(chainring))/cog;
		return rat;
	}
	public double gear_inches()
	{
		this.ratio();
		return rat*(rim + (tire*2) );
	}
}
class Main_3 {
	public static void main(String[] args) {
		Gear gear = new Gear(52,11,26,1.5);
		System.out.println(gear.gear_inches());
		Gear gear1 = new Gear(52,11,24,1.25);
		System.out.println(gear1.gear_inches());
	}
}