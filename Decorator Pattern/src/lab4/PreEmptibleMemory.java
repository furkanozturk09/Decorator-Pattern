package lab4;


public class PreEmptibleMemory extends Resource {

    Server server;

    public PreEmptibleMemory(Server server) {
        this.server = server;
    }

    @Override
    public String getDescription() {
        return server.getDescription() + ", PE-Memory";
    }

    @Override
    public double cost() {
        return 0.000920 + server.cost();
    }
}
