class Wheel {
	private int rim,tire;
	Wheel(int[] data)
	{
		this.rim = data[0];
		this.tire = data[1];
	}
	public int getRim()
	{
		return this.rim;
	}
	public int getTire()
	{
		return this.tire;
	}
}
class Gear {
	Wheel wheel;
	Gear(int[] data)
	{
		wheel = new Wheel(data);
	}
	public int diameter()
	{
		int dia = wheel.getRim() + (wheel.getTire()*2);
		return dia;
	}
}
class Main_4 {
	public static void main(String[] args) {
		int[] data = new int[]{ 50,12 };
		Gear gear = new Gear(data);
		System.out.println(gear.diameter());
	}
}