package mission;
class circle{
	private double rad;
	double pi= 3.14;
	void circle() {
		rad=0;
	}
	circle(double r){
		rad=r;
	}
	double mianji() {
		return pi*rad*rad;
	}
	double zhouchang() {
		return 2*pi*rad;
	}
	void show() {
		System.out.println("circle半径为:"+rad);
		System.out.println("circle面积为:"+mianji());
		System.out.println("circle周长为:"+zhouchang());
	}
	
}
class cylinder extends circle{
	private double high;
	public cylinder(double r,double h) {
		super(r);
		high=h;
	}
	double tiji() {
		return mianji()*high;
	}
	void showhigh() {
	System.out.println("圆柱体的体积是:"+tiji());
	}
}
public class Mission21 {
	public static void main(String[]args) {
		circle a1= new circle(4.0);
		cylinder a2 = new cylinder(4.0,10.0);
			a1.show();
			a2.showhigh();
	}
}
