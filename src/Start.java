public class Start {
    public static void main(String[] args) {
        Car car1 = new Car("Supra",30000);

        //Forse il mio JDK non è compatibile con il @SuppressWarnings.
        //Questo è l'unico modo che ho trovato per usarlo senza avere un errore sull'utiizzo a rigo 7.
        @SuppressWarnings("deprecated")
        String carDetails = car1.printCarDetails();
        System.out.println(carDetails);
        car1.getCarDetails();
    }
}
