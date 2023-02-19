
public class MainEscalar {
	public static void main(String[] args) {
		Escalar matriz1 = new Escalar(2, 3, 3);
        matriz1.setValor(0, 0, 1);
        matriz1.setValor(0, 1, 2);
        matriz1.setValor(0, 2, 3);
        matriz1.setValor(1, 0, 4);
        matriz1.setValor(1, 1, 5);
        matriz1.setValor(1, 2, 6);
        
        System.out.println("La matriz original es:");
        for (int i = 0; i < matriz1.getFilas(); i++) {
            for (int j = 0; j < matriz1.getColumnas(); j++) {
                System.out.print(matriz1.getValor(i, j)+ " ");
            }
            System.out.println("");
        }
        
        Escalar mR = matriz1.multiplicar();

        System.out.println("La matriz resultante es:");
        for (int i = 0; i < mR.getFilas(); i++) {
            for (int j = 0; j < mR.getColumnas(); j++) {
                System.out.print(mR.getValor(i, j)+ " ");
            }
            System.out.println("");
        }
	}
}
