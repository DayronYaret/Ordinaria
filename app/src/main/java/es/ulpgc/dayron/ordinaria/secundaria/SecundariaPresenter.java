package es.ulpgc.dayron.ordinaria.secundaria;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.dayron.ordinaria.app.Item;

public class SecundariaPresenter implements SecundariaContract.Presenter {

  public static String TAG = SecundariaPresenter.class.getSimpleName();

  private WeakReference<SecundariaContract.View> view;
  private SecundariaViewModel viewModel;
  private SecundariaContract.Model model;
  private SecundariaContract.Router router;

  public SecundariaPresenter(SecundariaState state) {
    viewModel = state;
  }

  @Override
  public void injectView(WeakReference<SecundariaContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(SecundariaContract.Model model) {
    this.model = model;
  }

  @Override
  public void injectRouter(SecundariaContract.Router router) {
    this.router = router;
  }

  @Override
  public void fetchData() {
    // Log.e(TAG, "fetchData()");

    Item item = router.getDataFromPreviousScreen();
    if (viewModel.item == null) {
      // call the model
      viewModel.item=item;

      // set initial state
    }

    // update the view
    viewModel.item= model.getItemSingular(item.getId());
    viewModel.position=model.getPosition(item.getId());
    view.get().displayData(viewModel);

  }

  @Override
  public void moveLeft() {
  model.moveLeft(viewModel.item.getId());
  fetchData();
  }

  @Override
  public void moveRight() {
  model.moveRight(viewModel.item.getId());
  fetchData();
  }


}
