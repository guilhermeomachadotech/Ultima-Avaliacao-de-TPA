import java.util.Scanner;
public class ProdutosDona {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		double precoProduto[], dinheiroTotal=150.00, somaProdutos=0, media, produtoCaro=-1;
		int i=0, TAM=5;
		precoProduto=new double[TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o valor do "+(i+1)+"° produto:");
			precoProduto[i]=ler.nextDouble();
			somaProdutos=somaProdutos+precoProduto[i];
			if(precoProduto[i]>produtoCaro) {
				produtoCaro=precoProduto[i];
			}
		}
		System.out.println(" A soma total dos produtos é "+somaProdutos);
		media=somaProdutos/5;
		System.out.println("A média dos produtos é "+media);
		System.out.println("O preço do produto mais caro é "+produtoCaro);
		if (dinheiroTotal<somaProdutos) {
			System.out.println("Você não consegue comprar os produtos!");
		}else {
			System.out.println ("Você consegue comprar os produtos!");
		}
		ler.close();
	}
}
