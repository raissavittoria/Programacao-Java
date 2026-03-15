package ClassesObjetos;

public class TestaAr {

    public static void main(String[] args) {

        // Instanciar objeto
        ArCondicionado ar = new ArCondicionado("Samsung", "WindFree", 22);

        // Tentar alterar temperatura
        ar.ajustarTemperatura(10);
        ar.ajustarTemperatura(25);

        // Imprimir dados
        System.out.println(ar);

        // Tentar modo turbo desligado
        ar.modoTurbo();

        // Ligar aparelho
        ar.ligar();

        // Usar modo turbo
        ar.modoTurbo();

        // Mostrar estado final
        System.out.println("\nEstado final:");
        System.out.println(ar);
    }
}