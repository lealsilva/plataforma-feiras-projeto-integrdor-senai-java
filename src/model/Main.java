package model;

public class Main {

    public static void main(String[] args) {

        Feira feira1 = new Feira(1, "Feira da Lua", "Setor Oeste",
                -16.685267576304824, -49.264181797389774);

        Feirante feirante1 = new Feirante(1, "Wilkys Leal",
                "Blindagem de equipamentos avançados",
                "Peliculas", "4002-8922", "Aprovado");

        EscalaFeira escalafeira1 = new EscalaFeira(
                1, feirante1, feira1, "Sabado", "16:20", "23:00");

        System.out.println("Banca: " + escalafeira1.getFeirante().getNomeDaBanca());
        System.out.println("Local: " + escalafeira1.getFeira().getNome()
                + " (" + escalafeira1.getFeira().getBairro() + ")");
        System.out.println("Horario: " + escalafeira1.getDiaDaSemana()
                + " das " + escalafeira1.getHorarioDeEntrada()
                + " ás " + escalafeira1.getHorarioDeSaida());
    }
}