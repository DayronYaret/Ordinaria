package es.ulpgc.dayron.ordinaria.secundaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.ulpgc.dayron.ordinaria.R;

public class SecundariaActivity
    extends AppCompatActivity implements SecundariaContract.View {

  public static String TAG = SecundariaActivity.class.getSimpleName();

  private SecundariaContract.Presenter presenter;
  private Button leftButton, rightButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_secundaria);

    leftButton=findViewById(R.id.leftButton);
    rightButton=findViewById(R.id.rightButton);

    leftButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        presenter.moveLeft();
      }
    });
    rightButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        presenter.moveRight();
      }
    });

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
    ((TextView) findViewById(R.id.idTextView)).setText(Integer.toString(viewModel.item.getId()));
    ((TextView) findViewById(R.id.positiontextView)).setText(Integer.toString(viewModel.position));

  }
}
