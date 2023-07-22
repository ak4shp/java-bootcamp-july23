
public class ReturnValues{
    public static void main(String[] args) {
        double area = calculateArea(1.2, 2.4);
        double area2 = calculateArea(1.2, 0);

        System.out.println("Area is: "+area);
        System.out.println("Area is: "+area2);

        System.out.println(explainArea("spanish"));
        System.out.println(explainArea("japanese"));
    }

    public static double calculateArea(double length, double width){
        // Edge case
        if(length <= 0 || width <= 0){
            System.out.println("INVALID DIMENSION !!");
            System.exit(0);  //! Terminates the currently running Java Virtual Machine*/
        }
        double area = length * width;
        return area;
    }

    public static String explainArea(String language){
        String areaSentance = "";
        if(language.equals("english")){
            areaSentance = "Area equals length * width";
        } else if(language.equals("french")){
            areaSentance = "La surface est egale a la longueur * la largeur";
        } else if(language.equals("spanish")){
            areaSentance = "area es igual a largo * ancho";
        } else{
            areaSentance = "Currently " +language+ " is unavailable!";
        }

        return areaSentance;
    }
}
