package es.ulpgc.dayron.ordinaria.secundaria;

import java.lang.ref.WeakReference;

interface SecundariaContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void displayData(SecundariaViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);

    void injectModel(Model model);

    void injectRouter(Router router);

    void fetchData();
  }

  interface Model {
    String fetchData();
  }

  interface Router {
    void navigateToNextScreen();

    void passDataToNextScreen(SecundariaState state);

    SecundariaState getDataFromPreviousScreen();
  }
}