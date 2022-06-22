public class Team {
    private final String name;
    private final GameCharacter[] team = new GameCharacter[3];

    public Team(String name, GameCharacter character2, GameCharacter character3, GameCharacter character1) {
        this.name = name;
        this.team[0] = character1;
        this.team[1] = character2;
        this.team[2] = character3;
    }

    public String getName() {
        return name;
    }

    public GameCharacter[] getTeam() {
        return team;
    }

    public double attack() {
        double totalDamage = 0;
        for (GameCharacter gameCharacter : team) {
            totalDamage += gameCharacter.totalAttack();
        }
        return totalDamage;
    }

    public double defense() {
        double totalDefence = 0;
        for (GameCharacter gameCharacter : team) {
            totalDefence += gameCharacter.totalDefense();
        }
        return totalDefence;
    }

    public double energy() {
        double totalEnergy = 0;
        for (GameCharacter gameCharacter : team) {
            totalEnergy += gameCharacter.getEnergy();
        }
        return totalEnergy;
    }
}
