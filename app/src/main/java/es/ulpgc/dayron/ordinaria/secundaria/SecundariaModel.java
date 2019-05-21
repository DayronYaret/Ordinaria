package es.ulpgc.dayron.ordinaria.secundaria;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

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
}
