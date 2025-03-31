import java.util.Scanner;

public class TesteClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comprados = 0;
        String nomeProd;
        String tipo;
        int codProd = 0;
        int qtd = 0;
        int i;
        float valor = 0;
        Produto proC1 = new Produto(0);
        Produto proC2 = new Produto(0,"NULL");
        Produto proC3 = new Produto(0, "NULL", 0);
        Produto proC4 = new Produto(0, "NULL", 0, "NULL", 0);

        System.out.println("Teste do construtor C1, digite o codigo: ");
        codProd = sc.nextInt();
        if(codProd < 1){
            while (codProd < 1) {
                System.out.println("Codigo invalido(dever maior que 0) digite novamente:");
                codProd = sc.nextInt();
            }
        }
        proC1 = new Produto(codProd);
        
        System.out.println("Construtor C2, digite o codigo, nome: ");
        codProd =sc.nextInt();
        if(codProd < 1){
            while (codProd < 1) {
                System.out.println("Codigo invalido(dever maior que 0) digite novamente:");
                codProd = sc.nextInt();
            }
        }
        sc.nextLine();
        nomeProd = sc.nextLine();
        proC2 = new Produto(codProd, nomeProd);

        System.out.println("Construtor C3, digite o codigo, nome, quantidade: ");
        codProd =sc.nextInt();
        if(codProd < 1){
            while (codProd < 1) {
                System.out.println("Codigo invalido(dever maior que 0) digite novamente:");
                codProd = sc.nextInt();
            }
        }
        sc.nextLine();
        nomeProd = sc.nextLine();
        qtd = sc.nextInt();
        proC3 = new Produto(codProd, nomeProd, qtd);

        System.out.println("Construtor C4, digite o codigo, nome, quantidade, tipo, valor: ");
        codProd =sc.nextInt();
        if(codProd < 1){
            while (codProd < 1) {
                System.out.println("Codigo invalido(dever maior que 0) digite novamente:");
                codProd = sc.nextInt();
            }
        }
        sc.nextLine();
        nomeProd = sc.nextLine();
        qtd = sc.nextInt();
        sc.nextLine();
        tipo = sc.nextLine();
        valor = sc.nextFloat();
        proC4 = new Produto(codProd, nomeProd, qtd, tipo, valor);

        proC1.consultar();
        proC2.consultar();
        proC3.consultar();
        proC4.consultar();
        
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("Usando metodo inserir no construtor C1");
        System.out.println("Inserindo os dados -> Nome: C1 Qtd: 10 Tipo: Construtor1 Valor: 10.0");
        proC1.inserir(proC1.codProd, "C1", 10, "Construtor", 10);
        
        System.out.println("Testando os Metodos no construtor C1:");
        System.out.println("C1-> (Vender)Valor Total Vendido-> R$" + proC1.vender(10));
        System.out.print("C1-> (Comprar(int qtdNew)) -> ");
        proC1.comprar(10);
        System.out.print("C1-> (Comprar(int qtdNew, valNew)) -> ");
        proC1.comprar(10, 100);
        proC1.consultar();

        System.out.println("Usando metodo inserir no construtor C2");
        System.out.println("Inserindo os dados -> Nome: C2 Qtd: 20 Tipo: Construtor2 Valor: 20.0");
        proC2.inserir(proC2.codProd,proC2.nomeProd, 20, "Construtor 2", 20);
        System.out.println("-------------------------------------");
        System.out.println("Testando os Metodos no construtor C2:");
        System.out.println("C2-> (Vender)Valor Total Vendido-> R$" + proC2.vender(10));
        System.out.print("C2-> (Comprar(int qtdNew)) -> ");
        proC2.comprar(10);
        System.out.print("C2-> (Comprar(int qtdNew, valNew)) -> ");
        proC2.comprar(10, 100);
        proC2.consultar();

        System.out.println("Usando metodo inserir no construtor C3");
        System.out.println("Inserindo os dados -> Nome: C3 Qtd: 30 Tipo: Construtor3 Valor: 30.0");
        proC3.inserir(proC3.codProd,proC3.nomeProd, proC3.qtd, "Construtor 3", 30);
        System.out.println("-------------------------------------");
        System.out.println("Testando os Metodos no construtor C3:");
        System.out.println("C3-> (Vender)Valor Total Vendido-> R$" + proC3.vender(10));
        System.out.print("C3-> (Comprar(int qtdNew)) -> ");
        proC3.comprar(10);
        System.out.print("C3-> (Comprar(int qtdNew, valNew)) -> ");
        proC3.comprar(10, 100);
        proC3.consultar();

        System.out.println("-------------------------------------");
        System.out.println("Testando os Metodos no construtor C4:");
        System.out.println("C4-> (Vender)Valor Total Vendido-> R$" + proC4.vender(10));
        System.out.print("C4-> (Comprar(int qtdNew)) -> ");
        proC4.comprar(10);
        System.out.print("C4-> (Comprar(int qtdNew, valNew)) -> ");
        proC4.comprar(10, 100);
        proC4.consultar();
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("Comparando Produtos C1 com C1");
        proC1.igual(proC1, proC1);
        System.out.println("Comparando Produtos C1 com C2");
        proC1.igual(proC1, proC2);
        System.out.println("Comparando Produtos C1 com C3");
        proC1.igual(proC1, proC3);
        System.out.println("Comparando Produtos C1 com C4");
        proC1.igual(proC1, proC4);
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("Comparando Produtos C2 com C2");
        proC2.igual(proC2, proC2);
        System.out.println("Comparando Produtos C2 com C3");
        proC2.igual(proC2, proC3);
        System.out.println("Comparando Produtos C2 com C4");
        proC2.igual(proC2, proC4);
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("Comparando Produtos C3 com C3");
        proC3.igual(proC3, proC3);
        System.out.println("Comparando Produtos C3 com C4");
        proC3.igual(proC3, proC4);
        
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("Comparando Produtos C4 com C4");
        proC4.igual(proC4, proC4);
    }
}
