package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a = 1; //conversão implícita
        System.out.println(a);
        float b = (float) 1.2345788888; // explicita (Cast)
        System.out.println(b);
        int c = 130;
        byte d = (byte)c; // explicita (CAST)
        System.out.println(d);

        double e = 1.9999999;
        int f = (int)e;
        System.out.println(f);
    }
}
