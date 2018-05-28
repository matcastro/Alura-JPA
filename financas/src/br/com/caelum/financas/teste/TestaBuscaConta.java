package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaBuscaConta {
	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = em.find(Conta.class, 1);
		
		conta.setTitular("Mateus Ribeiro");
		conta.setBanco("208 - BTG PACTUAL");
		conta.setAgencia("0001");
		conta.setNumero("43332-8");
		
		System.out.println(conta.getTitular());
		
		em.getTransaction().commit();
		em.close();
	}
}
