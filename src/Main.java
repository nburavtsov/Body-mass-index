public class Main {
    public static void main(String[] args) {
        Bodymassindex service = new Bodymassindex();
        float m = 84.5F;
        float h = (float) Math.pow(1.79,2);
        float ibm = service.calculate(m,h);
        System.out.printf("%.3f",ibm);
    }
}
