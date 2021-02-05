package lab4;


 
public class OnDemandMemory extends Resource {

    Server server;

    public OnDemandMemory(Server server) {
        this.server = server;
    }

    @Override
    public String getDescription() {
        return server.getDescription() + ", OD-Memory";
    }

    @Override
    public double cost() {
        return 0.003067 + server.cost();
    }
}
