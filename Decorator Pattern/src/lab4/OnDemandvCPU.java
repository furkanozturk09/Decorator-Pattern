package lab4;


public class OnDemandvCPU extends Resource {

    Server server;

    public OnDemandvCPU(Server server) {
        this.server = server;
    }

    @Override
    public String getDescription() {
        return server.getDescription() + ", OD-vCPU";
    }

    @Override
    public double cost() {
        return 0.022890 + server.cost();
    }
}
