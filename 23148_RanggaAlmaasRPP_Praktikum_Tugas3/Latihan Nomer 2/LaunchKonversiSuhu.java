public class LaunchKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu suhu1 = new KonversiSuhu();
        double celcius = 25.0;
        System.out.println(celcius + " Celcius ke Fahrenheit: " + suhu1.celciusToFahrenheit(celcius));
        System.out.println(celcius + " Celcius ke Reamur: " + suhu1.celciusToReamur(celcius));

        KonversiSuhuKedua suhu2 = new KonversiSuhuKedua();
        double fahrenheit = 77.0;
        System.out.println(fahrenheit + " Fahrenheit ke Reamur: " + suhu2.fahrenheitToReamur(fahrenheit));

        System.out.println(celcius + " Celcius ke Fahrenheit: " + suhu2.celciusToFahrenheit(celcius));
        System.out.println(celcius + " Celcius ke Reamur: " + suhu2.celciusToReamur(celcius));
    }
}
