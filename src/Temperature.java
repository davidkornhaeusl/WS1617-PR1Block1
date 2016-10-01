

public class Temperature {
	
	public static void main(String [] args) {
		
		double celsius = 30.0;
		
		System.out.println(celsius + " degrees Celsius are "
				+ celsius2Fahrenheit(celsius) + " degrees Fahrenheit");
		
		double fahrenheit = 451.0;
		
		System.out.println(fahrenheit + " degrees Fahrenheit are "
				+ fahrenheit2Celsius(fahrenheit) + " degrees Celsius");
		
	}
	
	public static double celsius2Fahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	public static double fahrenheit2Celsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit-32);
	}
	
}
