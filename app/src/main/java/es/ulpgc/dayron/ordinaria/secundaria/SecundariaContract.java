package es.ulpgc.dayron.ordinaria.secundaria;

import java.lang.ref.WeakReference;

import es.ulpgc.dayron.ordinaria.app.Item;

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

    void moveLeft();

    void moveRight();
  }

  interface Model {
    String fetchData();

    Item getItemSingular(int id);

    int getPosition(int id);

    void moveLeft(int id);

    void moveRight(int id);
  }

  interface Router {
    void navigateToNextScreen();

    void passDataToNextScreen(SecundariaState state);

    Item getDataFromPreviousScreen();
  }
}
