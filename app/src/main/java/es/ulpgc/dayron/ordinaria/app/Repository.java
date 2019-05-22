package es.ulpgc.dayron.ordinaria.app;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Repository implements RepositoryContract {
  public static Repository INSTANCE;
  private Context context;
  private List<Item> items = new ArrayList<>();


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
  public Item getItemSingular(int id) {
    for(int i=0; i<items.size(); i++){
      if(items.get(i).getId()==id){
        return items.get(i);
      }
    }
    return null;
  }

  @Override
  public int getPosition(int id) {
    for(int i=0; i<items.size(); i++){
      if(items.get(i).getId()==id){
        return i+1;
      }
    }
    return 0;
  }

  @Override
  public void moveLeft(int id) {
    for(int i=0; i<items.size(); i++){
      if(items.get(i).getId()==id){
        if(i==0){
          return;
        }
        items.add(i-1,items.get(i));
        items.remove(i+1);
      }
    }
  }

  @Override
  public void moveRight(int id) {
    for(int i=0; i<items.size(); i++){
      if(items.get(i).getId()==id) {
        if (i == items.size() - 1) {
          return;
        }
        Item actual = items.get(i);
        int position = i;
        items.remove(i);
        items.add(position+1, actual);
        return;

      }
      }
    }


  @Override
  public List<Item> getItem() {
    return items;
  }

}
