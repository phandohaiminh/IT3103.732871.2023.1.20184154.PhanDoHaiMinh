package hust.soict.dsai.aims.screen;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
    private Cart cart;
    private Store store;
    private JFrame stage;
    @FXML
    private TableView<Media> tblMedia;
    
    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;
    
    @FXML
    private ToggleGroup filterCategory;
    
    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;
    
    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    private RadioButton radioBtnFilterTitle;
    
    @FXML
    private TextField tfFilter;
    
    @FXML
    private Label costLabel;
    
    public CartScreenController(Cart cart, Store store, JFrame stage) {
    	super();
    	this.cart = cart;
    	this.store = store;
    	this.stage = stage;
    }
    
    @FXML
    private void initialize() {
    	colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("Title"));
    	colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("Category"));
    	colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("Cost"));
    	tblMedia.setItems(this.cart.getItemsOrdered());
    	
    	btnPlay.setVisible(false);
    	btnRemove.setVisible(false);
    	
    	tblMedia.getSelectionModel().selectedItemProperty().addListener(
    			new ChangeListener<Media>() {
					@Override
					public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
						if(newValue != null) {
							updateButtonBar(newValue);
						}
					}
				}
    	);
    	
    	tfFilter.textProperty().addListener(new ChangeListener<String>() {
    		@Override
    		public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
    			showFilteredMedia(newValue);
    		}
    	});
    }
    
    void updateButtonBar(Media media) {
    	btnRemove.setVisible(true);
    	if(media instanceof Playable) {
    		btnPlay.setVisible(true);
    	}
    	else {
    		btnPlay.setVisible(false);
    	}
    }
    
    @FXML
    void btnRemovePressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	cart.removeMedia(media);
    	costLabel.setText(cart.totalCost() + " $");
    	Alert alert = new Alert(Alert.AlertType.INFORMATION, "the "+media.getTitle()+" has been removed from cart");
    	alert.showAndWait();
    }
    
    @FXML
    void btnPlayPressed(ActionEvent event) {
    		Media media = tblMedia.getSelectionModel().getSelectedItem();
        	Alert alert;
			try {
				alert = new Alert(Alert.AlertType.INFORMATION, ((Playable) media).play().toString());
				alert.showAndWait();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
    }
    
    void showFilteredMedia(String filter) {
    	String filterType;
    	if (radioBtnFilterTitle.isSelected()) {
    		filterType = "title";
    	} else {
    		filterType = "id";
    	}
    	
    	FilteredList<Media> list = new FilteredList<>(cart.getItemsOrdered(), null);
		list.setPredicate(media -> media.filterProperty(filter, filterType));
		
		if (cart.getItemsOrdered()!= null) {
			tblMedia.setItems(list);
		}
    }
    
	@FXML
    void btnViewStorePressed(ActionEvent event) {
    	new StoreScreen(store, cart);
    	stage.hide();
    }
    
    @FXML
    void placeOrderClicked(ActionEvent event) {
    	Alert alert = new Alert(Alert.AlertType.INFORMATION, "The total cost is " + cart.totalCost() + " $");
    	alert.showAndWait();
    	cart.setEmpty();
    	costLabel.setText(this.cart.totalCost() + " $");
    	tblMedia.setItems(null);
    }
    @FXML
    void btnAddBookPressed(ActionEvent event) {
    	new AddBookToStoreScreen(store, cart);
    }

    @FXML
    void btnAddCDPressed(ActionEvent event) {
    	new AddCompactDiscToStoreScreen(store, cart);
    }

    @FXML
    void btnAddDVDPressed(ActionEvent event) {
    	new AddDigitalVideoDiscToStoreScreen(store, cart);
    }
}
