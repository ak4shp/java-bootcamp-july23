public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        switch (weather) {
            case "sunny": System.out.println("Sunny day");
            case "cloudy": System.out.println("About to rain");
            case "rainy": System.out.println("Rain started");
            case "snowy": System.out.println("Looks like Freezing");
            default: System.out.println("It is confusing");
                break;
        }
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch

        // Section 2: User role
        int role = 2;
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch 
        //* Switch */
        switch (role) {
            case 1: System.out.println("Admin"); break;
            case 2: System.out.println("Editor"); break;
            case 3: System.out.println("User"); break;
            default: System.out.println("Wrong credentials"); break;
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch
        //* if-else because 2 variables to be compared */
        System.out.println(temperature + humidity);

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch
        //* if-else because 2 variables to be compared */
        System.out.println(age + income);


        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch
        //* Switch */
        System.out.println(lightColor);

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch
        //* Switch */
        System.out.println(grade);

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        //* Switch */   
        System.out.println(browser);
    }
}
