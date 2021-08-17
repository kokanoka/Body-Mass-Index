public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(55,1.71);
        System.out.println(bodyMassIndex);
    }
}
