package model;

public class ArCondicionado extends CarroDecorator {
    public ArCondicionado(Carro carro) {
        super(carro);
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Ar Condicionado";
    }

    @Override
    public double custo() {
        return super.custo() + 2000.0;
    }
}
