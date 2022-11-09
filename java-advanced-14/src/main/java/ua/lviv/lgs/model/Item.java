package ua.lviv.lgs.model;

import java.util.Objects;
import java.util.Set;

public class Item {
    private Integer id;
    private Integer total;
    private Set<Cart> carts;

    public Item() {
    }

    public Item(Integer total,Set<Cart> carts) {
        this.total = total;
        this.carts = carts;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(total, item.total) && Objects.equals(carts, item.carts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, carts);
    }
}

