package es.ulpgc.dayron.ordinaria.app;

import java.util.List;

public interface RepositoryContract {
    List<Item> getItem();

    void add();

    Item getItemSingular(int id);

    int getPosition(int id);

    void moveLeft(int id);

    void moveRight(int id);
}
