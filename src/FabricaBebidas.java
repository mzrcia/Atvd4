import java.util.Locale;

public class FabricaBebidas {
    public Bebidas gerarBebidas(String bebidas){
        if (bebidas == "" || bebidas == null){
            return null;
        }

        if (bebidas.toUpperCase().equals("CERVEJA")){
            return new Cerveja();
        } else if (bebidas.toUpperCase().equals("REFRIGERANTE")){
            return new Refrigerante();
        }
        return null;

    }
}
