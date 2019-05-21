package es.ulpgc.dayron.ordinaria.principal;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

import es.ulpgc.dayron.ordinaria.app.RepositoryContract;

public class PrincipalModel implements PrincipalContract.Model {

  public static String TAG = PrincipalModel.class.getSimpleName();
  private RepositoryContract repository;
  public PrincipalModel(RepositoryContract repository) {
  this.repository=repository;
  }

  @Override
  public String fetchData() {
    // Log.e(TAG, "fetchData()");
    return "Hello";
  }
}
