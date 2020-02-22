package br.com.sversutti.drogaria.util;

import org.hibernate.Session;
import org.junit.Test;

import br.com.controle.projetoeb.util.HibernateUtil;

public class HibernateUtilTest {
	@Test
	public void conectar() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
}
