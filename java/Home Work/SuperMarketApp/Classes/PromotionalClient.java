package Classes;

import java.util.Random;

public class PromotionalClient extends Actor {

    private String namePromotion;
    private int idClient;
    private int numberParticipants;
    int min = 9;
    int diff = 999 - min;
    Random random = new Random();
    private int xz = random.nextInt(diff + 1) + min;

    /**
     * Конструр для заполнения всех параметров класса
     *
     * @param namePromotion      - Имя акции
     * @param idClient           - Id Клиента(Случайное целое число)
     * @param numberParticipants - Кол-во участников акции
     */
    public PromotionalClient(String name, String namePromotion, int idClient, int numberParticipants) {
        super(name);
        this.namePromotion = namePromotion;
        this.idClient = xz;
        this.numberParticipants = numberParticipants;
    }

    /**
     * Изначальный пустой констуктор,для переназчения параметров класса на значения
     * по умолчанию
     */
    public PromotionalClient(String name) {
        this(name, "5'ost", 9999999, 16);
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

    public Actor getActor() {
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

    public String getNamePromotion() {
        return namePromotion;
    }

    public void setNamePromotion(String namePromotion) {
        this.namePromotion = namePromotion;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getNumberParticipants() {
        return numberParticipants;
    }

    public void setNumberParticipants(int numberParticipants) {
        this.numberParticipants = numberParticipants;
    }

    public int getXz() {
        return xz;
    }

    public void setXz(int xz) {
        this.xz = xz;
    }

}
