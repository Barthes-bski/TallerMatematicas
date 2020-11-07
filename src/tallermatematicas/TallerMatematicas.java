package tallermatematicas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TallerMatematicas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz m = new Matriz();
        int opcion;

        int respuesta;
        do {
            do {
                System.out.println("¿Qué operación desea hacer?");
                System.out.println("1: SUMA");
                System.out.println("2: RESTA");
                System.out.println("3: PONDERACIÓN POR UN ESCALAR");
                System.out.println("4: MULTIPLICACIÓN");
                System.out.println("5: TRANSPUESTA");
                opcion = sc.nextInt();
            } while ((opcion != 1) && (opcion != 2) && (opcion != 3) && (opcion != 4) && (opcion != 5));

            switch (opcion) {
                case 1:
                    System.out.println("INGRESE TAMAÑO MATRIZ");
                    System.out.println("INGRESE FILAS");
                    int filas = sc.nextInt();
                    //int filas = Integer.parseInt(JOptionPane.showInputDialog("INGRESE FILAS"));
                    System.out.println("INGRESE COLUMNAS");
                    int columnas = sc.nextInt();
                    //int columnas = Integer.parseInt(JOptionPane.showInputDialog("iNNGRESE COLUMNAS"));
                    int[][] matriz1 = new int[filas][columnas];
                    m.escribirDatos(matriz1);
                    System.out.println("INGRESE TAMAÑO 2° MATRIZ");
                    System.out.println("INGRESE FILAS");
                    filas = sc.nextInt();
                    //filas = Integer.parseInt(JOptionPane.showInputDialog("INGRESE FILAS"));
                    System.out.println("INGRESE COLUMNAS");
                    columnas = sc.nextInt();
                    //columnas = Integer.parseInt(JOptionPane.showInputDialog("iNNGRESE COLUMNAS"));
                    int[][] matriz2 = new int[filas][columnas];
                    m.escribirDatos(matriz2);

                    m.sumaMatriz(matriz1, matriz2);
                    break;
                case 2:
                    System.out.println("INGRESE TAMAÑO MATRIZ");
                    System.out.println("INGRESE FILAS");
                    filas = sc.nextInt();
                    System.out.println("INGRESE COLUMNAS");
                    columnas = sc.nextInt();
                    matriz1 = new int[filas][columnas];
                    m.escribirDatos(matriz1);
                    System.out.println("INGRESE TAMAÑO 2° MATRIZ");
                    System.out.println("INGRESE FILAS");
                    filas = sc.nextInt();
                    System.out.println("INGRESE COLUMNAS");
                    columnas = sc.nextInt();
                    matriz2 = new int[filas][columnas];
                    m.escribirDatos(matriz2);
                    m.restaMatriz(matriz1, matriz2);
                    break;
                case 3:
                    System.out.println("PONDERACIÓN POR ESCALAR");
                    System.out.println("INGRESE TAMAÑO MATRIZ");
                    System.out.println("INGRESE FILAS");
                    filas = sc.nextInt();
                    System.out.println("INGRESE COLUMNAS");
                    columnas = sc.nextInt();
                    matriz1 = new int[filas][columnas];
                    m.escribirDatos(matriz1);
                    System.out.println("INGRESE VALOR QUE MULTIPLICARA LA MATRIZ");
                    int valor = sc.nextInt();
                    int[][] resultado = new int[filas][columnas];
                    m.ponderaciónPorEscalar(matriz1, resultado, valor);
                    System.out.println("MATRIZ ORIGINAL");
                    m.mostrarMatriz(matriz1);
                    System.out.println("RESULTADO");
                    m.mostrarMatriz(resultado);
                    break;
                case 4:
                    System.out.println("MULTIPLICACIÓN");
                    System.out.println("INGRESE TAMAÑO MATRIZ");
                    System.out.println("INGRESE FILAS");
                    filas = sc.nextInt();
                    System.out.println("INGRESE COLUMNAS");
                    columnas = sc.nextInt();
                    matriz1 = new int[filas][columnas];
                    m.escribirDatos(matriz1);
                    System.out.println("INGRESE TAMAÑO 2° MATRIZ");
                    System.out.println("INGRESE FILAS");
                    filas = sc.nextInt();
                    System.out.println("INGRESE COLUMNAS");
                    columnas = sc.nextInt();
                    matriz2 = new int[filas][columnas];
                    m.escribirDatos(matriz2);
                    resultado = new int[matriz1.length][matriz2[0].length];
                    m.multiplicarMatrices(matriz1, matriz2, resultado);
                    m.mostrarMatriz(resultado);
                    break;
                case 5:
                    System.out.println("TRANSPUESTA");
                    System.out.println("INGRESE TAMAÑO MATRIZ");
                    System.out.println("INGRESE FILAS");
                    filas = sc.nextInt();
                    System.out.println("INGRESE COLUMNAS");
                    columnas = sc.nextInt();
                    matriz1 = new int[filas][columnas];
                    int[][] transpuesta = new int[matriz1[0].length][matriz1.length];
                    m.escribirDatos(matriz1);
                    System.out.println("MATRIZ ORIGINAL");
                    m.mostrarMatriz(matriz1);
                    System.out.println("");
                    System.out.println("MATRIZ TRANSPUESTA");
                    m.transpuesta(matriz1, transpuesta);
                    m.mostrarMatriz(transpuesta);
                    break;
                default:

            }

            System.out.println("DESEA REALIZAR OTRA ACCIÓN [1]SÍ/[0]NO");
            respuesta = sc.nextInt();
            System.out.println("-----------------------------------");
        } while (respuesta == 1);

    }
}

