import java.util.Arrays;
import java.util.List;

public class Iva {
    public static void main(String[] args) {
        List<Integer> facturas = Arrays.asList(11,22,33,44,55,66,77,88,99,100);
        List<Integer> resultado;
        resultado = calcular(facturas,21);
        System.out.println(resultado);
    }

    private static List<Integer> calcular(List<Integer> sinIva, int porcentaje) {
            if (porcentaje == 21) {
                sinIva.stream().map((x)->(x*0.21));
                return sinIva;
            }
            sinIva.stream().map((x)->(x*porcentaje/100));

            return sinIva;
        }

}


