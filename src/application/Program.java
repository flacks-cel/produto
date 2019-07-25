package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Entre com a quantidade de produtos : ");
		int n = sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			System.out.println("Produto # : " + i + "  Insira os dados: ");
			System.out.print("O Produto é, comum, usado ou importado (c/u/i)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome : ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço : ");
			double preco = sc.nextDouble();
			if (preco == 'c') {
				Produto prod = new Produto(nome, preco);
				list.add(prod);
			}
			else if (preco == 'u') {
				System.out.print("Data da fabricação (DD/MM/YYYY) :");
				Date data = sdf.parse(sc.next());
				Produto prod1 = new ProdutoUsado(nome, preco, data);
				list.add(prod1);
				
			}
			else {
				System.out.print("Valor da alfandega : ");
				double alfandega = sc.nextDouble();
				Produto prod2 = new ProdutoImportado(nome, preco, alfandega);
				list.add(prod2);
				
			}
			
		}
		
		System.out.println();
		System.out.println("Etiqueta de Preço : ");
		for (Produto pro : list) {
			System.out.println(pro.etiqueta());
		}
		
		sc.close();

	}

}
