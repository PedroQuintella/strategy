public class Funcionario {

    private float salario;

    public float getSalario() {
        return salario;
    }

    public void multiplicarSalario(float salario1, float valor) {
        Calculadora calculadora = new Calculadora(salario1, valor);
        this.salario = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void somarSalario(float salario1, float valor) {
        Calculadora calculadora = new Calculadora(salario1, valor);
        this.salario = calculadora.calcular(new OperacaoSomar());
    }

    public void subtrairSalario(float salario1, float valor) {
        Calculadora calculadora = new Calculadora(salario1, valor);
        this.salario = calculadora.calcular(new OperacaoSubtrair());
    }
}
