class Gear {
	private int chainring,cog;
	Gear(int a,int b)
	{
		chainring=a;
		cog=b;

	}
	public double ratio(){
		double rat= ((1.0)*(chainring))/cog;
		return rat;
	}
}
class Main_2 {
	public static void main(String[] args) {
		Gear gear = new Gear(50,12);
		System.out.println(gear.ratio());
		Gear gear1 = new Gear(30,27);
		System.out.println(gear1.ratio());
	}
}