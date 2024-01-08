package lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = parametro -> System.out.println(parametro.getNome() + "!!");
        
        Produto p1 = new Produto("Notebook", 3900, 0.15);
        Produto p2 = new Produto("Mouse", 89, 0.5);
        Produto p3 = new Produto("Teclado", 120, 0.5);
        Produto p4 = new Produto("Mouse pad", 90, 0.5);
        Produto p5 = new Produto("Suporte", 25, 0.0);
        
        imprimirNome.accept(p1);
        
        List<Produto> estoque = Arrays.asList(p1, p2, p3, p4, p5);
     
        estoque.forEach(imprimirNome);
        estoque.forEach(p -> System.out.println(p.getPreco()));
        estoque.forEach(System.out::println);
        
    }
}
