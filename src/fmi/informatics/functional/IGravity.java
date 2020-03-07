package fmi.informatics.functional;

// Създаваме интерфейс IGravity с default метод
public interface IGravity {
	
	default double acceleration() {
		return 9.80665;
	}
	
	double height();
	
	default double speedAtImpact(double heightMeters) {
		double acceleration = acceleration();
		double height = height();
		return Math.sqrt(2 * acceleration * height);
	}
}
