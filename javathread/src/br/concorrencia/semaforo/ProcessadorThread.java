package br.concorrencia.semaforo;

import java.util.concurrent.Semaphore;

public class ProcessadorThread extends Thread {
    private int idThread;
    private Semaphore semaforo;
 
    public ProcessadorThread(int id, Semaphore semaphore) {
        this.idThread = id;
        this.semaforo = semaphore;
    }

    private void processar() {
        try {
            System.out.println("Thread #" + idThread + " processando");
            Thread.sleep((long) (Math.random() * 10000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void entrarRegiaoNaoCritica() {
        System.out.println("Thread #" + idThread + " em região não crítica");
        processar();
    }
    
    private void entrarRegiaoCritica() {
        System.out.println("Thread #" + idThread
                + " entrando em região crítica");
        processar();
        System.out.println("Thread #" + idThread + " saindo da região crítica");
    }
    
    public void run() {
        entrarRegiaoNaoCritica();
        try {
            semaforo.acquire();
            entrarRegiaoCritica();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaforo.release();
        }
    }
}
