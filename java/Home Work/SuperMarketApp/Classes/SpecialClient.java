package Classes;

public class SpecialClient extends Actor  {

    private int idVIP;

    public SpecialClient(String name, int id) {
        super(name);
        this.idVIP = id;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public Actor getActor()
    {
        return this;
    }

    @Override
    public String getName() {
        return super.name;        
    }

    @Override
    public void setName(String name) {
       super.name = name;        
    }

    public int getIdVIP() {
        return idVIP;
    }

    public void setIdVIP(int idVIP) {
        this.idVIP = idVIP;
    }
}
