/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_linsyposso;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author CARMEN POSSO
 */
public class Lab7P1_LinsyPosso {
    static Scanner Leer = new Scanner (System.in);
    static Random rand = new Random ();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir = true;
        
        while (seguir){
            System.out.println(" MENU ");
            System.out.println("1.She shoot, she scores!");
            System.out.println("2.Pierda, papel o ...");
            System.out.println("3.Salir");
            System.out.println("Ingrese una opcion: ");
            int op = Leer.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingrese el numero de filas (N)");
                    int n = Leer.nextInt();
                    System.out.println("Ingrese el numero de columnas (M)");
                    int m = Leer.nextInt();
                    System.out.println("Ingrese cantidad de disparos: ");
                    int disp = Leer.nextInt();
                    int maxBalas = n * m/2;
                     if (disp <= 0 || disp> maxBalas) {
                    System.out.println("Error: La cantidad de disparos debe estar entre 1 y " + maxBalas + ".");
                     }
                     int [][]mat = new int [n][m];
                     
                     break;
                      
                      
                case 2:
                    String[] opciones = {"", "Piedra", "Papel", "Tijeras", "Lagarto", "Spock"};
                    int[][] matrizGanadora = {
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 2, 1, 1, 2},
                        {0, 1, 0, 2, 2, 1},
                        {0, 2, 1, 0, 1, 2},
                        {0, 2, 1, 2, 0, 1},
                        {0, 1, 2, 1, 2, 0}
        };
                    while (true){
                    System.out.print("Elija qué quiere usar (1-Piedra, 2-Papel, 3-Tijeras, 4-Lagarto, 5-Spock): ");
                    int eleccionjugador = Leer.nextInt();
                    if (eleccionjugador < 1 || eleccionjugador > 5) {
                    System.out.println("Elección inválida. Por favor, elija una opción válida.");
                    continue;
                    }
                    int eleccionMaquina = rand.nextInt(5) + 1;
                System.out.println("El jugador eligió: " + opciones[eleccionjugador]);
                System.out.println("La máquina eligió: " + opciones[eleccionMaquina]);
                
                int resultado = matrizGanadora[eleccionjugador][eleccionMaquina];
                if (resultado == 0) {
                System.out.println("¡Empate!");
                } else if (resultado == 1) {
                System.out.println("¡El jugador gana!");
            } else if (resultado == 2) {
                System.out.println("¡La máquina gana!");
            }

            System.out.println();
            break;                              
    }
        case 3:
            default:
                System.out.println("Byee:)");
                break;
}          
    }
}
    public static int [][] llenar (int[][]mat, int n, int m){
        int random =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
             random = rand.nextInt(n*m)+1;
             while (verificar(mat, random)){
                 random = rand.nextInt(n*m)+1;
             }
             mat[i][j]=random;
            }
            
        }
        
        return mat;
    }
    public static boolean verificar (int[][]mat,int n){
        boolean esta = false;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int num = 0;
                if (num==mat[i][j]){
                    esta = true;
                }
                
            }
            
        }
        return esta;
    }
}

    
  

   