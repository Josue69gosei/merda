package TesteConta;

import poo.gestaodecaixaeletronico.CadastroContas;
import poo.gestaodecontas.Conta;
import poo.gestaodecaixaeletronico.Terminal;
import poo.gestaodecontas.Cliente;

public class amain {
  public static void main(String[] args) {
	  Cliente clientes[] = { new Cliente("123", "Joao"), new Cliente("123","Josue"), new Cliente("123", "Cadu") };
	  
	  CadastroContas  bd = new CadastroContas(3);
	   
	  for(int i = 0; i < clientes.length; i++) {
		  bd.adicionarConta(new Conta(i+1,clientes[i], 123, 1000.0 ));
	  }
	  Terminal meuTerminal = new Terminal(bd);
	  meuTerminal.iniciaOperacao();
	 
  }
}
