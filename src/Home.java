public class Home {
    public static void main(String[] args) {
        FabricaBebidas tipoBebida = new FabricaBebidas();

        Cerveja minhaCerveja = (Cerveja) tipoBebida.gerarBebidas("cerveja");
        minhaCerveja.criarBebida();

        Refrigerante meuRefri = (Refrigerante) tipoBebida.gerarBebidas("refrigerante");
        meuRefri.criarBebida();
    }
}
