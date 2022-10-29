package lab3p1_samuelzortoo;

import java.util.Scanner;

public class Lab3P1_SamuelZortoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero del ejercicio: ");
        System.out.println("[1] Ejercicio 1");
        System.out.println("[2] Ejercicio 2");
        System.out.println("[3] Ejercicio 3");
        System.out.print("==> ");
        int ejercicio_sz = entrada.nextInt();
        do{ // Si hice el menu con do while todo bonito
            switch (ejercicio_sz) {
                case 1: // hahahahahahahahahahahahahahahahahahahahaha no puedo :(
                    System.out.println("Ingrese una cadena: ");
                    String cadena_sz = "";
                    cadena_sz = entrada.nextLine();
                    cadena_sz = entrada.nextLine();        
                    
                    break;
                case 2: //son las 7:22 pm a ver si logro terminar este
                    System.out.println("Ingrese k: ");
                    double k_sz = entrada.nextDouble();
                    double acum_sz = 0;
                    
                    if(k_sz >= 0){
                        for(int n_sz = 1; n_sz <= k_sz; n_sz++){
                            double ecu1_sz = (2 * n_sz) + 1;
                            double ecu2_sz = (n_sz * n_sz) + 3;
                            double ecu3_sz = ecu2_sz;
                            for(double fac_sz = ecu2_sz; fac_sz > 1; fac_sz--){
                                ecu3_sz = ecu3_sz * (fac_sz - 1);
                            }
                            double result_sz = ecu1_sz / ecu3_sz;
                            acum_sz = acum_sz + result_sz; 
                        }
                        System.out.println("Resultado: " + acum_sz);
                        // 7:36pm creo que lo hice, espero que fucione
                        // SI FUNCIONOOOOOOO (obvi que sin la n^k pero igual) WOOOOOOOOOOOOO
                        
                    }else{
                        System.out.println("El numero debe ser positivo");
                    }
                    
                    
                    
                    
                    break;
                case 3:
                    System.out.println("Ingrese la altura: ");
                    int alt = entrada.nextInt();
                    int alt1 = (alt * 2) - 1;
                    for(int i_sz=0; i_sz < alt1; i_sz++){
                        System.out.println();
                        for(int j_sz = 0; j_sz < alt1; j_sz++){
                            System.out.print(""); // puse esto a lo loco y funciono  thumbs up
                            if((i_sz == 0) || (i_sz == alt1 - 1)){
                                if(j_sz % 2 == 0){
                                    System.out.print("*");
                                }else{
                                    System.out.print(" ");
                                }
                            }else if(i_sz == j_sz){
                                System.out.print("*");
                            }else if(i_sz + j_sz == alt1 - 1){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                            // En este ejercicio si me pegue tremenda craneada
                            
                        }
                        
                    }
                    
                    
                    break;
                default:
                    break;
            }
            System.out.println("");
            System.out.println("Ingrese el numero del ejercicio: ");
            System.out.println("[1] Ejercicio 1");
            System.out.println("[2] Ejercicio 2");
            System.out.println("[3] Ejercicio 3");
            System.out.print("==> ");
            ejercicio_sz = entrada.nextInt();
        }
        while((ejercicio_sz >= 1) && (ejercicio_sz <= 3));
    }
    
}
