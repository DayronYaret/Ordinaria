package es.ulpgc.dayron.ordinaria.principal;

import java.lang.ref.WeakReference;
import java.util.List;

import es.ulpgc.dayron.ordinaria.app.Item;

interface PrincipalContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void displayData(PrincipalViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);

    void injectModel(Model model);

    void injectRouter(Router router);

    void fetchData();

    void selectItemListData(Item item);

    void add();
  }

  interface Model {
    String fetchData();

    List<Item> getItem();

    void add();
  }

  interface Router {
    void navigateToNextScreen();

    void passDataToNextScreen(Item item);

    PrincipalState getDataFromPreviousScreen();
  }
}
