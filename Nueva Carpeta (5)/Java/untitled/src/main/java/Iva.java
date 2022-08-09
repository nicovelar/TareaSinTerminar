import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Iva {
    public static void main(String[] args) {
        List<Double> facturas = Arrays.asList(11.0,22.0,33.0,44.0,55.0,66.0,77.0,88.0,99.0,100.0);

        System.out.println(calcular(facturas,0.21));
        System.out.println(calcular(facturas,0.25));
        System.out.println(calcular(facturas));
    }
    private static List<Double> calcular(List<Double> sinIva, Double porcentaje) {
        return sinIva.stream()
                .map(x -> x * (porcentaje + 1))
                .collect(Collectors.toList());
    }

    private static List<Double> calcular(List<Double> sinIva) {
        return sinIva.stream()
                .map(x -> x * 1.21)
                .collect(Collectors.toList());
    }

}

