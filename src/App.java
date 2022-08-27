public class App {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.Info();
        Agent agent2 = new Agent("cobaagent", 100);
        agent2.Info();
        Player player = new Player();
        player.InfoPlayer();
        Player player2 = new Player(10, 5);
        player2.InfoPlayer();
    }
}
