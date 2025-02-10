package model;

public class RodasLigaLeve extends CarroDecorator {
    public RodasLigaLeve(Carro carro) {
        super(carro);
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Rodas de liga leve";
    }

    @Override
    public double custo() {
        return super.custo() + 2000.0;
    }
}
