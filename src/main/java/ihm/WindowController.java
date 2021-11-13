package ihm;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

public class WindowController implements Initializable{
	Parent root = null;


	@FXML
	Button button, saveButton, changeButton, resetButton, helpButton;  

	@FXML
	ColorPicker Color1, Color2, Color3, Color4, Color5, Color6, Color7, Color8, Color9, Color10;

	@FXML
	CheckBox Ch1, Ch2, Ch3, Ch4, Ch5, Ch6, Ch7, Ch8, Ch9, Ch10;

	@FXML
	ComboBox<String> combo1, combo2, combo3, combo4, combo5, combo6, combo7, combo8, combo9, combo10;

	@FXML
	HBox HBoxColor1, HBoxColor2, HBoxColor3, HBoxColor4, HBoxColor5, HBoxColor6, HBoxColor7, HBoxColor8, HBoxColor9, HBoxColor10;

	@FXML
	HBox HBoxGrey1, HBoxGrey2, HBoxGrey3, HBoxGrey4, HBoxGrey5, HBoxGrey6, HBoxGrey7, HBoxGrey8, HBoxGrey9, HBoxGrey10;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("salut");
		//ResetAll();
		combo1.setVisible(false);
		combo2.setVisible(false);
		combo3.setVisible(false);
		combo4.setVisible(false);
		combo5.setVisible(false);
		combo6.setVisible(false);
		combo7.setVisible(false);
		combo8.setVisible(false);
		combo9.setVisible(false);
		combo10.setVisible(false); 

		/**
		 * Set the color of the Hbox like the ColorPicker and make color proposing when the CheckBox is selected
		 */
		EventHandler<ActionEvent> eventColorFromPicker = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e)
			{

				//======================== Dés.activation couleur et nuance de gris
				if (Ch1.isSelected()) {
					HBoxColor1.setBackground(new Background(new BackgroundFill(Color1.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey1.setBackground(new Background(new BackgroundFill(Color1.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));

					ColorProposing(combo1, Color1);
				}else {
					HBoxColor1.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey1.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
				}

				if (Ch2.isSelected()) {
					HBoxColor2.setBackground(new Background(new BackgroundFill(Color2.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey2.setBackground(new Background(new BackgroundFill(Color2.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
					ColorProposing(combo2, Color2);
				}else {
					HBoxColor2.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey2.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
				}

				if (Ch3.isSelected()) {
					HBoxColor3.setBackground(new Background(new BackgroundFill(Color3.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey3.setBackground(new Background(new BackgroundFill(Color3.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
					ColorProposing(combo3, Color3);
				}else {
					HBoxColor3.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey3.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
				}

				if (Ch4.isSelected()) {
					HBoxColor4.setBackground(new Background(new BackgroundFill(Color4.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey4.setBackground(new Background(new BackgroundFill(Color4.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
					ColorProposing(combo4, Color4);
				}else {
					HBoxColor4.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey4.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
				}

				if (Ch5.isSelected()) {
					HBoxColor5.setBackground(new Background(new BackgroundFill(Color5.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey5.setBackground(new Background(new BackgroundFill(Color5.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
					ColorProposing(combo5, Color5);
				}else {
					HBoxColor5.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey5.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
				}

				if (Ch6.isSelected()) {
					HBoxColor6.setBackground(new Background(new BackgroundFill(Color6.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey6.setBackground(new Background(new BackgroundFill(Color6.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
					ColorProposing(combo6, Color6);
				}else {
					HBoxColor6.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey6.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
				}

				if (Ch7.isSelected()) {
					HBoxColor7.setBackground(new Background(new BackgroundFill(Color7.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey7.setBackground(new Background(new BackgroundFill(Color7.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
					ColorProposing(combo7, Color7);
				}else {
					HBoxColor7.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey7.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
				}

				if (Ch8.isSelected()) {
					HBoxColor8.setBackground(new Background(new BackgroundFill(Color8.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey8.setBackground(new Background(new BackgroundFill(Color8.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
					ColorProposing(combo8, Color8);
				}else {
					HBoxColor8.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey8.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
				}

				if (Ch9.isSelected()) {
					HBoxColor9.setBackground(new Background(new BackgroundFill(Color9.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey9.setBackground(new Background(new BackgroundFill(Color9.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
					ColorProposing(combo9, Color9);
				}else {
					HBoxColor9.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey9.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
				}

				if (Ch10.isSelected()) {
					HBoxColor10.setBackground(new Background(new BackgroundFill(Color10.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey10.setBackground(new Background(new BackgroundFill(Color10.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
					ColorProposing(combo10, Color10);
				}else {
					HBoxColor10.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
					HBoxGrey10.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
				}






				/**
				 * set the combo box visible when the checkBox is Selected
				 */
				combo1.setVisible(Ch1.isSelected());
				combo2.setVisible(Ch2.isSelected());
				combo3.setVisible(Ch3.isSelected());
				combo4.setVisible(Ch4.isSelected());
				combo5.setVisible(Ch5.isSelected());
				combo6.setVisible(Ch6.isSelected());
				combo7.setVisible(Ch7.isSelected());
				combo8.setVisible(Ch8.isSelected());
				combo9.setVisible(Ch9.isSelected());
				combo10.setVisible(Ch10.isSelected());

			}
		};
		/**
		 * Open a Window when helpButton is Pressed
		 */
		helpButton.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{


			Label secondLabel = new Label("===========================================================================\n"
					+ "Cochez la case devant la couleurs pour pouvoir l'afficher et la sauvegarder\n\n"
					+ "Vous pouvez séléctionner la couleurs qui sera afficher dans le tableau avec sa version grise à coté\n\n"
					+ "Le bouton réinitialiser supprime toutes les couleurs et leurs séléction\n\n"
					+ "Le bouton Appliquer proposition changera les valeurs que vous avez mis avec les valeurs\nque vous avez séléctionné dans les rectangle en dessous\n\n"
					+ "Le bouton Sauvegarder et Quitter fermera le programme et créera un fichier texte dans votre bureau avec les données ");

			StackPane secondaryLayout = new StackPane();
			secondaryLayout.getChildren().add(secondLabel);

			Scene secondScene = new Scene(secondaryLayout, 630, 200);

			// New window (Stage)
			Stage newWindow = new Stage();
			newWindow.setTitle("Second Stage");
			newWindow.setScene(secondScene);

			// Specifies the modality for new window.
			newWindow.initModality(Modality.WINDOW_MODAL);

			newWindow.show();

		});
		/**
		 * reset all colorPicker , Hbox colors, and set comboBox in not Visible
		 */
		resetButton.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
			System.out.println("reset color");
			ResetAll();
		});
		
		/**
		 * Write the data of the color in a file and close the program when saveButton is Pressed
		 */
		saveButton.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			System.out.println("save color");
			SaveColors();
			System.exit(0);
		});

		/**
		 * When changeColor is pressed , all the colorPicker get the combo box values
		 */
		changeButton.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			setColorPickerValue(Color1, combo1, Ch1);
			setColorPickerValue(Color2, combo2, Ch2);
			setColorPickerValue(Color3, combo3, Ch3);
			setColorPickerValue(Color4, combo4, Ch4);
			setColorPickerValue(Color5, combo5, Ch5);
			setColorPickerValue(Color6, combo6, Ch6);
			setColorPickerValue(Color7, combo7, Ch7);
			setColorPickerValue(Color8, combo8, Ch8);
			setColorPickerValue(Color9, combo9, Ch9);
			setColorPickerValue(Color10, combo10, Ch10);

			MajColor (Ch1, HBoxColor1, HBoxGrey1, Color1);
			MajColor (Ch2, HBoxColor2, HBoxGrey2, Color2);
			MajColor (Ch3, HBoxColor3, HBoxGrey3, Color3);
			MajColor (Ch4, HBoxColor4, HBoxGrey4, Color4);
			MajColor (Ch5, HBoxColor5, HBoxGrey5, Color5);
			MajColor (Ch6, HBoxColor6, HBoxGrey6, Color6);
			MajColor (Ch7, HBoxColor7, HBoxGrey7, Color7);
			MajColor (Ch8, HBoxColor8, HBoxGrey8, Color8);
			MajColor (Ch9, HBoxColor9, HBoxGrey9, Color9);
			MajColor (Ch10, HBoxColor10, HBoxGrey10, Color10);
		});


		Ch1.setOnAction(eventColorFromPicker);
		Ch2.setOnAction(eventColorFromPicker);
		Ch3.setOnAction(eventColorFromPicker);
		Ch4.setOnAction(eventColorFromPicker);
		Ch5.setOnAction(eventColorFromPicker);
		Ch6.setOnAction(eventColorFromPicker);
		Ch7.setOnAction(eventColorFromPicker);
		Ch8.setOnAction(eventColorFromPicker);
		Ch9.setOnAction(eventColorFromPicker);
		Ch10.setOnAction(eventColorFromPicker);

		Color1.setOnAction(eventColorFromPicker);
		Color2.setOnAction(eventColorFromPicker);
		Color3.setOnAction(eventColorFromPicker);
		Color4.setOnAction(eventColorFromPicker); 
		Color5.setOnAction(eventColorFromPicker);
		Color6.setOnAction(eventColorFromPicker);
		Color7.setOnAction(eventColorFromPicker);
		Color8.setOnAction(eventColorFromPicker);
		Color9.setOnAction(eventColorFromPicker);
		Color10.setOnAction(eventColorFromPicker);

	}

	/**
	 * Write the color's data in a file , it will be save in Desktop
	 */
	void SaveColors () {
		String myPath = System.getProperty("user.home")+File.separator+"Desktop"+File.separator;
		int i = 1;
		try(PrintWriter pw = new PrintWriter(new File(myPath+"Couleurs.txt"))){
			if(Ch1.isSelected()) {
				pw.println("Couleur n°"+i+":");
				pw.println(Color1.getValue());
				pw.println();
				pw.println("Sa version Gris:");
				pw.println(Color1.getValue().grayscale());
				pw.println();
				i++;

			}if(Ch2.isSelected()) {
				pw.println("____________________________________");				
				pw.println("Couleur n°"+i+":");
				pw.println(Color2.getValue());
				pw.println();
				pw.println("Sa version Gris:");
				pw.println(Color2.getValue().grayscale());
				pw.println();
				i++;

			}if(Ch3.isSelected()) {
				pw.println("____________________________________");
				pw.println("Couleur n°"+i+":");
				pw.println(Color3.getValue());
				pw.println();
				pw.println("Sa version Gris:");
				pw.println(Color3.getValue().grayscale());
				pw.println();
				i++;
			}if(Ch4.isSelected()) {
				pw.println("____________________________________");
				pw.println("Couleur n°"+i+":");
				pw.println(Color4.getValue());
				pw.println();
				pw.println("Sa version Gris:");
				pw.println(Color4.getValue().grayscale());
				pw.println();
				i++;
			}if(Ch5.isSelected()) {
				pw.println("____________________________________");
				pw.println("Couleur n°"+i+":");
				pw.println(Color5.getValue());
				pw.println();
				pw.println("Sa version Gris:");
				pw.println(Color5.getValue().grayscale());
				pw.println();
				i++;
			}if(Ch6.isSelected()) {
				pw.println("____________________________________");
				pw.println("Couleur n°"+i+":");
				pw.println(Color6.getValue());
				pw.println();
				pw.println("Sa version Gris:");
				pw.println(Color6.getValue().grayscale());
				pw.println();
				i++;
			}if(Ch7.isSelected()) {
				pw.println("____________________________________");
				pw.println("Couleur n°"+i+":");
				pw.println(Color7.getValue());
				pw.println();
				pw.println("Sa version Gris:");
				pw.println(Color7.getValue().grayscale());
				pw.println();
				i++;
			}if(Ch8.isSelected()) {
				pw.println("____________________________________");
				pw.println("Couleur n°"+i+":");
				pw.println(Color8.getValue());
				pw.println();
				pw.println("Sa version Gris:");
				pw.println(Color8.getValue().grayscale());
				pw.println();
				i++;
			}if(Ch9.isSelected()) {
				pw.println("____________________________________");
				pw.println("Couleur n°"+i+":");
				pw.println(Color9.getValue());
				pw.println();
				pw.println("Sa version Gris:");
				pw.println(Color9.getValue().grayscale());
				pw.println();
				i++;
			}if(Ch10.isSelected()) {
				pw.println("____________________________________");
				pw.println("Couleur n°"+i+":");
				pw.println(Color10.getValue());
				pw.println();
				pw.println("Sa version Gris:");
				pw.println(Color10.getValue().grayscale());
				i++;
			}
		} catch (IOException e) {
			System.out.println("Writing error : " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * set combo box to visible 
	 * @param _combo
	 */
	void SetComboVisible (ComboBox<String> _combo)
	{
		_combo.setVisible(!_combo.isVisible());
	}

	/**
	 * add 5 color in the comboBox 
	 * @param _combo
	 * @param picker
	 */
	void ColorProposing(ComboBox<String> _combo, ColorPicker picker)
	{	
		if(_combo.getSelectionModel().getSelectedItem() != null && _combo.getItems().get(0).equals(picker.getValue().brighter().toString()))
			return;

		_combo.getItems().clear();
		_combo.getItems().addAll(
				picker.getValue().brighter().toString(),
				picker.getValue().darker().toString(),
				picker.getValue().darker().darker().toString(),
				picker.getValue().darker().darker().darker().toString(),
				picker.getValue().darker().darker().darker().darker().toString()
				);
		comboColor(_combo);
	}

	/**
	 * Apply the color proposed in the background of the comboBox
	 * @param womboCombo
	 */
	void comboColor (ComboBox<String> womboCombo)
	{
		womboCombo.setCellFactory(
				new Callback<ListView<String>, ListCell<String>>() {
					@Override public ListCell<String> call(ListView<String> param) {
						final ListCell<String> cell = new ListCell<String>() {
							@Override 
							public void updateItem(String item, boolean empty) {
								super.updateItem(item, empty);
								if (item != null) {
									setText(item);    
									if (item.contains("High")) {
										setTextFill(Color.RED);
									}
									Color c1 = Color.web(womboCombo.getItems().get(0));
									Color c2= Color.web(womboCombo.getItems().get(1));
									Color c3 = Color.web(womboCombo.getItems().get(2));
									Color c4= Color.web(womboCombo.getItems().get(3));
									Color c5 = Color.web(womboCombo.getItems().get(4));
									if (item.equals(womboCombo.getItems().get(0))) {
										setBackground(new Background(new BackgroundFill(c1, CornerRadii.EMPTY, Insets.EMPTY)));
										if ((c1.getBlue()*255 + c1.getGreen()*255 + c1.getRed()*255)/ 3 <= 70) {
											setTextFill(Color.WHITE);
										}
									}else if (item.equals(womboCombo.getItems().get(1))) {
										setBackground(new Background(new BackgroundFill(c2, CornerRadii.EMPTY, Insets.EMPTY)));
										if ((c2.getBlue()*255 + c2.getGreen()*255 + c2.getRed()*255)/ 3 <= 70) {
											setTextFill(Color.WHITE);
										}
									}else if (item.equals(womboCombo.getItems().get(2))) {
										setBackground(new Background(new BackgroundFill(c3, CornerRadii.EMPTY, Insets.EMPTY)));
										if ((c3.getBlue()*255 + c3.getGreen()*255 + c3.getRed()*255)/ 3 <= 70) {
											setTextFill(Color.WHITE);
										}
									}else if (item.equals(womboCombo.getItems().get(3))) {
										setBackground(new Background(new BackgroundFill(c4, CornerRadii.EMPTY, Insets.EMPTY)));
										if ((c4.getBlue()*255 + c4.getGreen()*255 + c4.getRed()*255)/ 3 <= 70) {
											setTextFill(Color.WHITE);
										}
									}else if (item.equals(womboCombo.getItems().get(4))) {
										setBackground(new Background(new BackgroundFill(c5, CornerRadii.EMPTY, Insets.EMPTY)));
										if ((c5.getBlue()*255 + c5.getGreen()*255 + c5.getRed()*255)/ 3 <= 70) {
											setTextFill(Color.WHITE);
										}
									}
								}
								else {
									setText(null);
								}
							}
						};
						return cell;
					}
				});
	}

	/**
	 * Modify the Color of the ColorPicker
	 * @param color
	 * @param combo
	 * @param ch
	 */
	void setColorPickerValue (ColorPicker color, ComboBox<String> combo, CheckBox ch)
	{
		if (combo.getSelectionModel().getSelectedItem() != null && ch.isSelected()) {
			color.setValue(Color.web(combo.getSelectionModel().getSelectedItem()));
			ColorProposing (combo, color);
		}
	}

	/**
	 * Update the color of the Xbox 
	 * @param ch
	 * @param color
	 * @param grayLevel
	 * @param picker
	 */
	void MajColor (CheckBox ch, HBox color, HBox grayLevel, ColorPicker picker)
	{
		if (ch.isSelected()) {
			color.setBackground(new Background(new BackgroundFill(picker.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
			grayLevel.setBackground(new Background(new BackgroundFill(picker.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
		}
	}

	/**
	 * UnSelect all the CheckBox and the combo box and put all ColorPicker in White 
	 */
	void ResetAll()
	{
		Ch1.setSelected(false);
		Ch2.setSelected(false);
		Ch3.setSelected(false);
		Ch4.setSelected(false);
		Ch5.setSelected(false);
		Ch6.setSelected(false);
		Ch7.setSelected(false);
		Ch8.setSelected(false);
		Ch9.setSelected(false);
		Ch10.setSelected(false);

		Color1.setValue(Color.WHITE);
		Color2.setValue(Color.WHITE);
		Color3.setValue(Color.WHITE);
		Color4.setValue(Color.WHITE);
		Color5.setValue(Color.WHITE);
		Color6.setValue(Color.WHITE);
		Color7.setValue(Color.WHITE);
		Color8.setValue(Color.WHITE);
		Color9.setValue(Color.WHITE);
		Color10.setValue(Color.WHITE);

		combo1.setVisible(false);
		combo2.setVisible(false);
		combo3.setVisible(false);
		combo4.setVisible(false);
		combo5.setVisible(false);
		combo6.setVisible(false);
		combo7.setVisible(false);
		combo8.setVisible(false);
		combo9.setVisible(false);
		combo10.setVisible(false);

		HBoxColor1.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxGrey1.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxColor2.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxGrey2.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxColor3.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxGrey3.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxColor4.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxGrey4.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxColor5.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxGrey5.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxColor6.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxGrey6.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxColor7.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxGrey7.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxColor8.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxGrey8.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxColor9.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxGrey9.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxColor10.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
		HBoxGrey10.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
}
