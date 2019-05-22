package es.ulpgc.dayron.ordinaria.secundaria;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import es.ulpgc.dayron.ordinaria.app.AppMediator;
import es.ulpgc.dayron.ordinaria.app.Item;

public class SecundariaRouter implements SecundariaContract.Router {

  public static String TAG = SecundariaRouter.class.getSimpleName();

  private AppMediator mediator;

  public SecundariaRouter(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void navigateToNextScreen() {
    Context context = mediator.getApplicationContext();
    Intent intent = new Intent(context, SecundariaActivity.class);
    context.startActivity(intent);
  }

  @Override
  public void passDataToNextScreen(SecundariaState state) {
    mediator.setSecundariaState(state);
  }

  @Override
  public Item getDataFromPreviousScreen() {
    Item item = mediator.getItem();
    return item;
  }
}
