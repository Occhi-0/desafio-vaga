public class DescobrirInterruptores {
    public static void main(String[] args) {
        
        int[] interruptores = new int[3];

        primeiraIda(interruptores);
        segundaIda(interruptores);

        imprimirEstadoInterruptores(interruptores);
    }

    
    public static void primeiraIda(int[] interruptores) {
        interruptores[0] = 1;
    }

    
    public static void segundaIda(int[] interruptores) {
        if (interruptores[0] == 1) {
            interruptores[1] = 1;
        } else {
            interruptores[2] = 1;
        }
    }

    public static void imprimirEstadoInterruptores(int[] interruptores) {
        System.out.println("Estado dos interruptores:");
        for (int i = 0; i < interruptores.length; i++) {
            System.out.println("Interruptor " + (i + 1) + ": " + interruptores[i]);
        }
    }
}

//Nesse aqui eu não entendi muito para ser sincero, não sei se consegui responder, perdão :)

