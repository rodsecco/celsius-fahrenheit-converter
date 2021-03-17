import java.util.Scanner;

public class Converter {

    Scanner temperature = new Scanner(System.in);
    double value;

    public double getTemperatura() {
        System.out.print("Insira aqui a temperatura: ");    
        value = temperature.nextDouble();
        return value;
    }

    public double toCelsius(double value){
        return (value - 32.0 ) * ( 5.0 / 9.0 );
    }
    
    public double toFahrenheit(double value){
        return (value * 5.0 / 9.0 ) + 32;
    }

    public static void main(String[] args) {
        System.out.println("Conversor de temperatura!!!");
        System.out.println("Deseja converter a temperatura para qual unidade de medida? \n 1- Celsius \n 2- Fahrenheit"); 
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if(choice == 1) {
            Converter converter = new Converter();
            double temperature = converter.getTemperatura();
            double result = converter.toCelsius(temperature);
            System.out.println("A temperatura inserida em Celsius e: " + result); 
        }
        else if(choice == 2) {
            Converter converter = new Converter();
            double temperature = converter.getTemperatura();
            double result = converter.toFahrenheit(temperature);
            System.out.println("A temperatura inserida em Fahrenheit e: " + result);                
        }
        else {
            System.out.println("Insira um opcao valida!");
        }
        sc.close();
    }
}