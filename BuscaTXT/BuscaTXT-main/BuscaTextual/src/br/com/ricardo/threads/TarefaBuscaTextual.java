package br.com.ricardo.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

	private String nomeArquivo;
	private String nomePessoa;

	public TarefaBuscaTextual(String nomeArquivo, String nomePessoa) {
		this.nomeArquivo = nomeArquivo;
		this.nomePessoa = nomePessoa;
		
	}

	@Override
	public void run() {

		try {

	Scanner scan = new Scanner(new File(nomeArquivo));
	int numeroLinha = 1;

	  while(scan.hasNextLine()){
		 String linha = scan.nextLine();

		 if(linha.toLowerCase().contains(nomePessoa.toLowerCase())){
			 System.out.println(nomeArquivo + " - " + numeroLinha + " - " + linha);

		 }
		 numeroLinha++;

	  }


	  scan.close();

		} catch (FileNotFoundException e) {

			throw new RuntimeException(e);
		}

	}

}
