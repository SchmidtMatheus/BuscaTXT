package br.com.ricardo.threads;

public class Main {

	public static void main(String[] args) {
		
		
		String nome = "Danielle Hall";
		String path = "D:/MATHEUS/Documents/Ciencias_da_computacao/CPED/BuscaTXT-main/BuscaTextual/";
		long inicio;

		Thread threadTeste1 = new Thread(new TarefaBuscaTextual(path+"a1.txt",nome));
		Thread threadTeste2 = new Thread(new TarefaBuscaTextual(path+"a2.txt",nome));
	    Thread threadTeste3 = new Thread(new TarefaBuscaTextual(path+"a3.txt",nome));
	    Thread threadTeste4 = new Thread(new TarefaBuscaTextual(path+"a4.txt",nome));
	    Thread threadTeste5 = new Thread(new TarefaBuscaTextual(path+"a5.txt",nome));
	    Thread threadTeste6 = new Thread(new TarefaBuscaTextual(path+"a6.txt",nome));
	    Thread threadTeste7 = new Thread(new TarefaBuscaTextual(path+"a7.txt",nome));
	    Thread threadTeste8 = new Thread(new TarefaBuscaTextual(path+"arq_1.txt",nome));
	    Thread threadTeste9 = new Thread(new TarefaBuscaTextual(path+"arq_2.txt",nome));
	    Thread threadTeste10 = new Thread(new TarefaBuscaTextual(path+"arq_3.txt",nome));
	    Thread threadTeste11 = new Thread(new TarefaBuscaTextual(path+"arq_4.txt",nome));
	    Thread threadTeste12 = new Thread(new TarefaBuscaTextual(path+"arq_5.txt",nome));

	    //inicia as threads
		inicio = System.currentTimeMillis();
	    threadTeste1.start();
		threadTeste2.start();
	    threadTeste3.start(); 
	    threadTeste4.start(); 
	    threadTeste5.start(); 
	    threadTeste6.start(); 
	    threadTeste7.start(); 
	    threadTeste8.start(); 
	    threadTeste9.start(); 
	    threadTeste10.start(); 
	    threadTeste11.start(); 
	    threadTeste12.start();

		long fim = System.currentTimeMillis();
		long total = fim - inicio;
		System.out.println("Tempo Total: "+total);
	}

}