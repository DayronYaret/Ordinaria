package es.ulpgc.dayron.ordinaria.secundaria;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

import es.ulpgc.dayron.ordinaria.app.Item;
import es.ulpgc.dayron.ordinaria.app.RepositoryContract;

public class SecundariaModel implements SecundariaContract.Model {

  public static String TAG = SecundariaModel.class.getSimpleName();
  private RepositoryContract repository;
  public SecundariaModel(RepositoryContract repository) {
  this.repository=repository;
  }

  @Override
  public String fetchData() {
    // Log.e(TAG, "fetchData()");
    return "Hello";
  }

  @Override
  public Item getItemSingular(int id) {
    return repository.getItemSingular(id);
  }

  @Override
  public int getPosition(int id) {
    return repository.getPosition(id);
  }

  @Override
  public void moveLeft(int id) {
  repository.moveLeft(id);
  }

  @Override
  public void moveRight(int id) {
  repository.moveRight(id);
  }
}
