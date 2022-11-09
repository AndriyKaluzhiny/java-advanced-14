package ua.lviv.lgs.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;
import ua.lviv.lgs.model.Cart;
import ua.lviv.lgs.model.Item;

import javax.imageio.spi.ServiceRegistry;
import java.util.Arrays;
import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        Item item1 = new Item();
        item1.setTotal(100);

        Item item2 = new Item();
        item2.setTotal(50);

        Item item3 = new Item();
        item3.setTotal(50);

        Item item4 = new Item();
        item4.setTotal(100);

        Cart cart = new Cart();
        cart.setName("Cart1");
        cart.setTotal(item1.getTotal()+item2.getTotal()+ item3.getTotal()+item4.getTotal());
        cart.setItems(new HashSet<Item>(Arrays.asList(item1,item2,item3,item4)));

        session.persist(item1);
        session.persist(item2);
        session.persist(item3);
        session.persist(item4);

        session.persist(cart);


        transaction.commit();
        session.close();
    }
}
