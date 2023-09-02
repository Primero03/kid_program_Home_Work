package Classes;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import Interfaces.iActorBehaviour;

import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {

    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        returnOrder();
        releaseFromQueue();
    }


    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }


    /**
     *  Метод,в котором происходит решение посетителя забирать/возвращаться заказ методом рандома
     * @param case1 - Пасетитель не доволен товаром,возвращает и уходит
     * @param case2 - Пасетителя все устраивает,забирает товар и уходит
     */
    @Override
    public void returnOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                int min = 1;
                int diff = 2 - min;
                Random random = new Random();
                int xz = random.nextInt(diff + 1) + min;
                actor.setTakeOrder(true);
                switch (xz) {
                    case 1:

                        System.out.println(actor.getActor().getName() + " клиент ВЕРНУЛ свой заказ");

                        break;
                    case 2:
                        System.out.println(actor.getActor().getName() + " клиент получил свой заказ");
                        break;
                }
            }
        }
    }
}
