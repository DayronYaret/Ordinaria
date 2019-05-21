package es.ulpgc.dayron.ordinaria.secundaria;

import android.util.Log;

import java.lang.ref.WeakReference;

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

    // set passed state
    SecundariaState state = router.getDataFromPreviousScreen();
    if (state != null) {
      viewModel.data = state.data;
    }

    if (viewModel.data == null) {
      // call the model
      String data = model.fetchData();

      // set initial state
      viewModel.data = data;
    }

    // update the view
    view.get().displayData(viewModel);

  }


}
