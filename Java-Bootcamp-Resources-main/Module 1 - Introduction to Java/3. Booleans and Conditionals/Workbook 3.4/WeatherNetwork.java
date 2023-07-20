public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 5;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if(temp <= -1){
            forecast = "FREEZING! Stay home!";
        } else if(temp <= 10){
            forecast = "Chilly. Wear a coat!";
        } else{
            forecast = "It's warm. Go outside!";  
        }

        System.out.println(forecast);
    }
}
