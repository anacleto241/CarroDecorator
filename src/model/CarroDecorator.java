package model;

public class CarroDecorator implements Carro {
    private Carro carro;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String descricao() {
        return carro.descricao();
    }

    @Override
    public double custo() {
        return carro.custo();
    }
}


