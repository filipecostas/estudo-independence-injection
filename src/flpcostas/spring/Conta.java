package flpcostas.spring;

import org.springframework.stereotype.Component;

@Component
public interface Conta {
	int getNumero();
	void saque();
	void deposito();
}
