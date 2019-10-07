/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author bmh5582
 */
public class MainController {

  MainModel model;
  MainView  view;

  public MainController(){

    model = new MainModel();
    view = new MainView();

  }

  //Returns the main model object.
  public MainModel getMainModel(){
    return model;
  }

  //Returns the main view class.
  public MainView getMainView(){
    return view;
  }

}
