package gui;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


	public class ControllerCookies  {
		 @FXML
		    private Label infoLabel;

		    @FXML
		    private ImageView cookieImage;

		    @FXML
		    private void showRedVelvet() {
		        infoLabel.setText("""
		                🍪 Red Velvet - R$13,00
		                Um cookie macio com um sabor levemente achocolatado, coloração avermelhada
		                e toque cremoso de cream cheese. Elegante e irresistível!
		                """);
		        updateImage("red_velvet.jpg");
		    }

		    @FXML
		    private void showOriginal() {
		        infoLabel.setText("""
		                🍪 Original - R$8,00
		                O clássico cookie americano: massa amanteigada com gotas generosas de
		                chocolate. Crocante por fora, macio por dentro. Perfeito para todas as horas!
		                """);
		        updateImage("original.jpg");
		    }

		    @FXML
		    private void showDoubleChocolate() {
		        infoLabel.setText("""
		                🍪 Double Chocolate - R$10,00
		                Uma explosão de chocolate! Massa escura com chocolate em dobro
		                e textura densa para os chocólatras de plantão.
		                """);
		        updateImage("double_chocolate.jpg");
		    }

		    private void updateImage(String imageName) {
		    	Image image = new Image(getClass().getResourceAsStream("/application/images/"));
		        cookieImage.setImage(image);
		    }
		}
