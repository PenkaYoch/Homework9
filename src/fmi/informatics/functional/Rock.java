package fmi.informatics.functional;

// Демонстриране чрез клас имплементиращ интерфейса IGravity
public class Rock implements IGravity {

	public double drop(double height) {
		double heightMeters = Math.abs(height);
		double timeToHitGround = Math.sqrt(2 * heightMeters / acceleration()); 
		System.out.format("It took %f seconds for the rock to hit the ground", timeToHitGround);
		return timeToHitGround;
	}

	public double drop() {
		double heightMeters = Math.abs(this.height());
		double timeToHitGround = Math.sqrt(2 * heightMeters / acceleration()); 
		System.out.format("It took %f seconds for the rock to hit the ground", timeToHitGround);
		return timeToHitGround;
	}
	
	@Override
	public double height() {
		return 1000;
	}
}
