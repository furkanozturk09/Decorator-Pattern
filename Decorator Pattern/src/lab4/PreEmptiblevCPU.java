package lab4;


 
public class PreEmptiblevCPU extends Resource {

    Server server;

    public PreEmptiblevCPU(Server server) {
        this.server = server;
    }

    @Override
    public String getDescription() {
        return server.getDescription() + ", PE-vCPU";
    }

    @Override
    public double cost() {
        return 0.006867 + server.cost();
    }
}
