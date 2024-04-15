public class InverterString {
    public static void main(String[] args) {
        
        String normal = "Para o desafio";
        
        System.out.println("String normal: " + normal);
        
        // Inverter a string e imprimir diretamente
        System.out.print("String invertida: ");
        inverterStringEImprimir(normal);
    }
    
    public static void inverterStringEImprimir(String str) {
       
        char[] caracteres = str.toCharArray();
        
        for (int i = caracteres.length - 1; i >= 0; i--) {
            System.out.print(caracteres[i]);
        }
        System.out.println(); 
    }
}

