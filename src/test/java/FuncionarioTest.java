import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveMultiplicarSalario() {
        Funcionario funcionario = new Funcionario();
        funcionario.multiplicarSalario(1500.0f, 4f);
        assertEquals(6000.0f, funcionario.getSalario());
    }

    @Test
    void deveSomarSalario() {
        Funcionario funcionario = new Funcionario();
        funcionario.somarSalario(2500, 850f);
        assertEquals(3350.0f, funcionario.getSalario());
    }

    @Test
    void deveSubtrairSalario() {
        Funcionario funcionario = new Funcionario();
        funcionario.subtrairSalario(3000f, 980f);
        assertEquals(2020.0f, funcionario.getSalario());
    }
}