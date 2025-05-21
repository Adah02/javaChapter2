public class PyramidOfGiza{

	public static void main(String[] args){

	final double MINUTES_PER_DAY = (60 * 24); 
	final double MINUTES_PER_YEAR = (MINUTES_PER_DAY * 365);
	double minutes_in_20_years = (MINUTES_PER_YEAR * 20);
	double hoursPerYear = (24 * 365);
	double tonsPerStone = 2.5;
	double totalNumberOfStones = 2300000;
	double totalNumberOfYears = 20;
	double totalWeightInTons = (tonsPerStone * totalNumberOfStones);

	double totalWeightPerMinute = (minutes_in_20_years / totalWeightInTons);
	double totalWeightPerHour = (totalWeightPerMinute * 60);
	double totalWeightPerYear = ((totalWeightPerHour * 24) * 360);

	System.out.printf("The weight per minute is %.2f tons.%n", totalWeightPerMinute);
	System.out.printf("The weight per hour is %.2f tons.%n", totalWeightPerHour);
	System.out.printf("The weight per year is %.2f tons.%n", totalWeightPerYear);

	}

}