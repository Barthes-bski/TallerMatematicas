package tallermatematicas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz {

    private int filas;
    private int columnas;
    private int matriz[][];

    public Matriz() {

    }

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    //Métodos
    //Poblar Matriz y PEDIR DATOS
    public void escribirDatos(int[][] mat) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.print("INGRESE VALOR PARA POSICIÓN" + "[" + i + "," + j + "] ===> ");
                mat[i][j] = sc.nextInt();
                //mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posición [" + (i + 1) + "," + (j + 1) + "] de la matriz"));
            }
        }
    }

    //Mostrar Matriz
    public void mostrarMatriz(int[][] mat) {
        String mostrar = "";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(" [" + mat[i][j] + "]");
            }
            System.out.println("");
            //mostrar += "\n";
        }
        //JOptionPane.showMessageDialog(null, mostrar);
    }

    //TRANSPUESTA
    public void transpuesta(int[][] mat, int[][] transpuesta) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                transpuesta[j][i] = mat[i][j];
            }
        }
    }

    //PONDERACIÓN POR ESCALAR
    public void ponderaciónPorEscalar(int[][] mat, int[][] resultado, int valor) {
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = valor * mat[i][j];
            }
        }
    }

    //SUMA
    public void sumaMatriz(int[][] mat1, int[][] mat2) {
        String mostrar = "";
        if ((mat1.length == mat2.length) && (mat1[0].length == mat2[0].length)) {
            int[][] suma = new int[mat1.length][mat1.length];
            System.out.println("EL RESULTADO DE LA SUMA ES: ");
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[0].length; j++) {
                    suma[i][j] = mat1[i][j] + mat2[i][j];
                    System.out.print(" [" + suma[i][j] + "]");
                }
                System.out.println("");
                //mostrar += "\n";
            }
        } else {
            System.out.println("ERROR - MATRICES SON DE DISTINTOS TAMAÑOS");
        }

    }

    //RESTA
    public void restaMatriz(int[][] mat1, int[][] mat2) {
        if ((mat1.length == mat2.length) && (mat1[0].length == mat2[0].length)) {
            int[][] resta = new int[mat1.length][mat1.length];
            System.out.println("EL RESULTADO DE LA RESTA ES: ");
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[0].length; j++) {
                    resta[i][j] = mat1[i][j] - mat2[i][j];
                    System.out.print(" [" + resta[i][j] + "]");
                }
                System.out.println("");
            }
        } else {
            System.out.println("ERROR - MATRICES SON DE DISTINTOS TAMAÑOS");
        }

    }

    //MULTIPLICACIÓN
    public void multiplicarMatrices(int[][] mat1, int[][] mat2, int[][] resultado) {
        if (mat1[0].length != mat2.length) {
            System.out.println("ERROR - DIMENSIONES INCOMPATIBLES");
            System.out.println("NÚMERO DE COLUMNAS DE MATRIZ 1 DEBE COINCIDIR CON NÚMERO FILAS MATRIZ 2");
        } else {
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat2[0].length; j++) {
                    for (int k = 0; k < mat1[0].length; k++) {

                        resultado[i][j] = resultado[i][j] + mat1[i][k] * mat2[k][j];
                    }

                }
            }
        }
    }
}
/*
la cantidad de elementos de cada fila(mat.length)
almacena la cantidad de filas de la matriz j 
mat[i].length cuando i vale cero
accedemos a la cantidad de elementos de la fila cero j así sucesivamente para cada valor de i):


 */
