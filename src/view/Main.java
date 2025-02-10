package view;
import model.*;

public class Main {
    public static void main(String[] args) {
            Carro carroBasico = new CarroBasico();
            System.out.println(carroBasico.descricao() + " - R$" + carroBasico.custo());

            Carro carroComAr = new ArCondicionado(carroBasico);
            System.out.println(carroComAr.descricao() + " - R$" + carroComAr.custo());

            Carro carroComArERodas = new RodasLigaLeve(new ArCondicionado(carroBasico));
            System.out.println(carroComArERodas.descricao() + " - R$" + carroComArERodas.custo());

            Carro carroCompleto = new DirecaoHidraulica(new RodasLigaLeve(new ArCondicionado(carroBasico)));
            System.out.println(carroCompleto.descricao() + " - R$" + carroCompleto.custo());
        }
}