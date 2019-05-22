package es.ulpgc.dayron.ordinaria.secundaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import es.ulpgc.dayron.ordinaria.R;

public class SecundariaActivity
    extends AppCompatActivity implements SecundariaContract.View {

  public static String TAG = SecundariaActivity.class.getSimpleName();

  private SecundariaContract.Presenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_secundaria);

    // do the setup
    SecundariaScreen.configure(this);
  }

  @Override
  protected void onResume() {
    super.onResume();

    // do some work
    presenter.fetchData();
  }

  @Override
  public void injectPresenter(SecundariaContract.Presenter presenter) {
    this.presenter = presenter;
  }

  @Override
  public void displayData(SecundariaViewModel viewModel) {
    //Log.e(TAG, "displayData()");

    // deal with the data
    //((TextView) findViewById(R.id.data)).setText(viewModel.data);
  }
}
