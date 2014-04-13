package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Sihtimismäng extends Application {
	double laske = 0;
	double tabamusi = 0;
	double protsendiarvutus = 0;

	@Override
	public void start(final Stage primaryStage) {

		final Rectangle sihtmärk = new Rectangle(400, 500, 10, 10);
		final Text skoor = new Text("Siia ilmub info koordinaatide kohta");
		final Text tabamus = new Text("Siia ilmub info tabamuste kohta");
		final Text protsent = new Text("0%");
		Slider kastiSuuruseLiugur = new Slider(5, 50, 10);
		skoor.setTranslateX(10);
		skoor.setTranslateY(10);
		tabamus.setTranslateX(10);
		tabamus.setTranslateY(20);
		protsent.setTranslateX(10);
		protsent.setTranslateY(30);
		kastiSuuruseLiugur.setLayoutX(10);
		kastiSuuruseLiugur.setLayoutY(40);
		kastiSuuruseLiugur.setShowTickLabels(true);
		kastiSuuruseLiugur.setShowTickMarks(true);
		kastiSuuruseLiugur.setMajorTickUnit(10);
		
		kastiSuuruseLiugur.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
            		sihtmärk.setHeight((Double) new_val);
            		sihtmärk.setWidth((Double) new_val);

            }
        });

		Group juur = new Group();
		final Scene stseen = new Scene(juur, 800, 600);
		stseen.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent klikk) {

				// võtame hiire ja sihtmärgi asukoha
				int hiireX = (int) klikk.getX();
				int hiireY = (int) klikk.getY();
				int smX = (int) sihtmärk.getX();
				int smY = (int) sihtmärk.getY();
				int kastiSuurus = (int) sihtmärk.getHeight();

				// seame sihtmärgi paika
				int y = (int) stseen.getHeight();
				int x = (int) stseen.getWidth();
				sihtmärk.setX(Math.random() * (x - kastiSuurus));
				sihtmärk.setY(Math.random() * (y - kastiSuurus));
				// kontrollime tabamust, ütleme kas pihta või mööda
				skoor.setText("hiireX " + hiireX + " hiireY " + hiireY
						+ " smX " + smX + " smY " + smY);
				tabamus.setText(PihtasaamiseKontroll.getHit(hiireX, hiireY,
						smX, smY, kastiSuurus));
				if (tabamus.getText() == "pihtas") {
					laske += 1;
					tabamusi += 1;
				} else
					laske += 1;
				protsendiarvutus = (tabamusi / laske) * 100;
				protsent.setText("tabamusi/laske: " + tabamusi + "/" + laske
						+ " täpsus: "
						+ Double.toString(Math.round(protsendiarvutus)) + "%");

			}

		});
		
		juur.getChildren().add(kastiSuuruseLiugur);
		juur.getChildren().add(protsent);
		juur.getChildren().add(tabamus);
		juur.getChildren().add(sihtmärk);
		juur.getChildren().add(skoor);
		primaryStage.setScene(stseen);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
