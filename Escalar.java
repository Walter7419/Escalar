
public class Escalar {
	private int[][] matriz;
    private int filas;
    private int columnas;
    private int escalar;

    public Escalar(int filas, int columnas, int escalar) {
        this.filas = filas;
        this.columnas = columnas;
        this.escalar = escalar;
        this.matriz = new int[filas][columnas];

    }

    

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getValor(int fila, int columna) {
        return matriz[fila][columna];
    }

    public void setValor(int fila, int columna, int valor) {
        matriz[fila][columna] = valor;
    }
    public Escalar multiplicar() {

        
        Escalar resultado = new Escalar(filas, columnas, escalar);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int valor = 0;
                    valor += matriz[i][j] * escalar;
                
                resultado.setValor(i, j, valor);
            }
        }

        return resultado;
    }
}
