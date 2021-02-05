package lab4;


 
public abstract class Server {

    String description = "Unknown Resource";

    public String getDescription() {return description; }

    public abstract double cost();

}
