package es.ulpgc.dayron.ordinaria.app;

import android.app.Application;

import es.ulpgc.dayron.ordinaria.principal.PrincipalState;
import es.ulpgc.dayron.ordinaria.secundaria.SecundariaState;


public class AppMediator extends Application {
  private PrincipalState principalState;
  private SecundariaState secundariaState;
  private Item item;

  public AppMediator(){
    principalState= new PrincipalState();
    secundariaState = new SecundariaState();
  }

  public PrincipalState getPrincipalState() {
    return principalState;
  }

  public void setPrincipalState(PrincipalState principalState) {
    this.principalState = principalState;
  }

  public SecundariaState getSecundariaState() {
    return secundariaState;
  }

  public void setSecundariaState(SecundariaState secundarioState) {
    this.secundariaState = secundarioState;
  }

    public void setItem(Item item) {
    this.item = item;
    }

  public Item getItem() {
    return item;
  }
}
