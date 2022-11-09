package ua.lviv.lgs.model;

import java.util.Objects;
import java.util.Set;

public class Cart {
    private Integer id;
    private Integer total;
    private String name;
    private Set<Item> items;

    public Cart() {
    }

    public Cart(Integer total, String name, Set<Item> items) {
        this.total = total;
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id.equals(cart.id) && Objects.equals(total, cart.total) && Objects.equals(name, cart.name) && items.equals(cart.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, name, items);
    }
}
