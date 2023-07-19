import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private List<String> teams;
    private List<String> fixtures;

    public Main(List<String> teams) {
        this.teams = teams;
        this.fixtures = new ArrayList<>();
    }

    public void generateFixtures() {
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int totalRounds = teams.size() - 1;
        int matchesPerRound = teams.size() / 2;

        List<String> homeTeams = new ArrayList<>(teams.subList(0, teams.size() / 2));
        List<String> awayTeams = new ArrayList<>(teams.subList(teams.size() / 2, teams.size()));
        Collections.reverse(awayTeams);

        for (int round = 0; round < totalRounds; round++) {
            for (int match = 0; match < matchesPerRound; match++) {
                String homeTeam = homeTeams.get(match);
                String awayTeam = awayTeams.get(match);

                String fixture = homeTeam + " vs " + awayTeam;
                fixtures.add(fixture);
            }

            Collections.rotate(homeTeams.subList(1, homeTeams.size()), 1);
            Collections.rotate(awayTeams.subList(0, awayTeams.size() - 1), 1);
        }
    }

    public void printFixtures() {
        int round = 1;
        for (String fixture : fixtures) {
            System.out.println("Round " + round);
            System.out.println(fixture);
            round++;
        }
    }

    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");

        Main generator = new Main(teams);
        generator.generateFixtures();
        generator.printFixtures();
    }
}
