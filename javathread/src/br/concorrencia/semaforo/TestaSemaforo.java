package br.concorrencia.semaforo;

import java.util.concurrent.Semaphore;

public class TestaSemaforo {
	public static void main(String[] args) {
	    int numeroDePermicoes = 2;
	    int numeroDeProcessos = 6;
	    Semaphore semaphore = new Semaphore(numeroDePermicoes);
	    ProcessadorThread[] processos = new ProcessadorThread[numeroDeProcessos];
	    for (int i = 0; i < numeroDeProcessos; i++) {
	        processos[i] = new ProcessadorThread(i, semaphore);
	        processos[i].start();
	    }
	}
}
