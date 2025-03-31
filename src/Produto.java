public class Produto {
    String nomeProd;
    String tipo;
    int codProd = 0;
    int qtd = 0;
    float valor = 0;

    public Produto(int codProd){
        this.codProd = codProd;
    }
    public Produto(int codProd, String nomeProd){
        this.codProd = codProd;
        this.nomeProd = nomeProd;
    }
    public Produto(int codProd, String nomeProd, int qtd){
        this.codProd = codProd;
        this.nomeProd = nomeProd;
        this.qtd = qtd;
    }
    public Produto(int codProd, String nomeProd, int qtd, String tipo, float valor){
        this.codProd = codProd;
        this.nomeProd = nomeProd;
        this.qtd = qtd;
        this.tipo = tipo;
        this.valor = valor;
    }

    float vender(int qtdVend){
        if (qtdVend > qtd) {
            System.out.println("Não existe tal quantidade no estoque!");
            return 0;
        }else{
            qtd -= qtdVend;
        }
        return qtdVend * valor; 
    }

    void comprar(int qtdNew, float valNew){
        if (qtdNew > 0) {
            this.qtd = qtd + qtdNew;
            System.out.println("Produtos comprados com sucesso!(Comprar(int qtdNew, valNew))");
        }else{
            System.out.println("Quantidade invalida!");
        }
        if (valNew > 0) {
            this.valor = valNew;
        }else{
            System.out.println("Valor invalido!");
        }
    }

    void comprar(int qtdNew){
        if (qtdNew > 0) {
            this.qtd = qtd + qtdNew;
            System.out.println("Produtos comprados com sucesso!!!(Comprar(int qtdNew))");
        }else{
            System.out.println("Quantidade invalida!");
        }
    }

    void consultar(){
        System.out.println("------------------------------");
        System.out.println("Consulta do produto");
        System.out.println("------------------------------");
        System.out.println("Codigo do Produto: " + codProd);
        System.out.println("Nome do Produto: " + nomeProd);
        System.out.println("Quantidade em estoque: " + qtd);
        System.out.println("Tipo do produto: " + tipo);
        System.out.println("Valor do produto: " + valor);
        System.out.println("------------------------------");
    }

    void inserir(int codProd, String nomeProd, int qtd, String tipo, float valor){
        this.codProd = codProd;
        this.nomeProd = nomeProd;
        this.qtd = qtd;
        this.tipo = tipo;
        this.valor = valor;
    }

    void igual(Produto prodC, Produto atual){
        if(prodC.equals(atual)){
            System.out.println("São o mesmo produto!");
        }else{
            System.out.println("Não o mesmo produto!");
        }
    }
}
