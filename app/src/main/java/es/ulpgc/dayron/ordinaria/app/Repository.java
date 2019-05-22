package es.ulpgc.dayron.ordinaria.app;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Repository implements RepositoryContract {
  public static Repository INSTANCE;
  private Context context;
  private List<Item> items = new ArrayList<>();
  private int clicks = 0;

  public static Repository getInstance(Context context) {
    if (INSTANCE == null) {
      INSTANCE = new Repository(context);
    }
    return INSTANCE;
  }

  private Repository(Context context) {
    this.context = context;
  }

  @Override
  public void add() {
    items.add(new Item( items.size()+1));
  }

  @Override
  public List<Item> getItem() {
    return items;
  }

}
