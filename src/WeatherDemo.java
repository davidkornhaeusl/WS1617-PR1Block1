public class WeatherDemo {

	public static void main(String[] args) {

		// calling a method with single parameter and no return value

		// using String literal
		printWeather("cold");
		printWeather("rainy");

		// using String variable
		String condition = "sunny";
		printWeather(condition);

		condition = "cloudy";
		printWeather(condition);

		// use method call directly
		System.out.println(buildWeatherText("warm", ":)"));

		// assign return value
		String text = buildWeatherText("freezing", ":(");
		System.out.println(text);
	}

	public static void printWeather(String weather) {
		System.out.println("The weather is " + weather);
	}

	public static String buildWeatherText(String weather, String emotion) {
		return "It's " + weather + " " + emotion;
	}
}
