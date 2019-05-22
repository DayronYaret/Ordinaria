package es.ulpgc.dayron.ordinaria.app;

import java.util.List;

public interface RepositoryContract {
    List<Item> getItem();

    void add();
}
