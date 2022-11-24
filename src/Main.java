import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da vinci tournament");
        // Enero es 0, Agosto es 7 Date es fecha (1, 31), Day dia de la semana Domingo es 0
        Date comienzoDeCuatri = new Date(2022, 7, 16);

        Date finDelCuatri = new Date(2022, 11, 5);

        Season torneoDaVinci = new Season(
            "Torneo POO 2022, 2do Cuatri",
            comienzoDeCuatri,
            finDelCuatri
        );

        Date fechaDeParcial = new Date(2022, 8, 29);

        Team profes = new Team("Equipo de profes");
        profes.addPlayer(new Player("Profe POO"));
        profes.addPlayer(new Player("Profe Web"));
        profes.addPlayer(new Player("Profe Mobile"));
        profes.addPlayer(new Player("Profe UX"));
        profes.addPlayer(new Player("Profe AE"));

        Team estudiantes = new Team("Equipo de estudiantes");
        estudiantes.addPlayer(new Player("San Martin"));
        estudiantes.addPlayer(new Player("Manuel Belgrano"));
        estudiantes.addPlayer(new Player("Mariano Moreno"));
        estudiantes.addPlayer(new Player("Matias Bernal"));
        estudiantes.addPlayer(new Player("Guillermo Probst"));

        //....
        Match primerParcial = new Match(
                "Aula virtual de POO jueves",
                fechaDeParcial,
                profes,
                estudiantes
        );
        torneoDaVinci.addMatch(primerParcial);

        System.out.println("Cantidad de jugadores: " + profes.getPlayers().size());
        System.out.println(String.format("Cantidad de match: %d", torneoDaVinci.getMatchs().size()));


        ArrayList<Match> partidosDeHoy = torneoDaVinci.getMatchs();

        partidosDeHoy.get(0).getLocalTeam().incrementGoalCounter();
        partidosDeHoy.get(0).getLocalTeam().incrementGoalCounter();
        partidosDeHoy.get(0).getVisitantTeam().incrementGoalCounter();


        System.out.println(
                partidosDeHoy.get(0).getLocalTeam().getName() + "(" +
                partidosDeHoy.get(0).getLocalTeam().getGoalCounter() + ")" +
                " - " +
                        partidosDeHoy.get(0).getVisitantTeam().getName() + "(" +
                partidosDeHoy.get(0).getVisitantTeam().getGoalCounter() + ")"
        );


    }
}
