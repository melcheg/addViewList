package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import sample.model.Person;


public class Controller {
    @FXML
    ListView listView;
    private Person yan = new Person("yan");

    ObservableList<Person> items = FXCollections.observableArrayList(param -> new Observable[] {param.getStringProperty()});
    @FXML
    public void initialize(){
        items.addAll(yan, new Person("erveverv"));
        listView.setItems(items);
    }
    @FXML
    public void add(){
        if (yan.getName().contentEquals("yan")) {
            yan.setName("yak");
        } else {
            yan.setName("yan");
        }

    }
}
