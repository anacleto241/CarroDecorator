package model;

public class DirecaoHidraulica extends CarroDecorator {
    public DirecaoHidraulica(Carro carro) {
        super(carro);
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Direção Hidráulica";
    }

    @Override
    public double custo() {
        return super.custo() + 1500.0;
    }
}
