package org.tbee.javafx.scene.layout.trial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import net.miginfocom.layout.AC;
import net.miginfocom.layout.CC;
import net.miginfocom.layout.LC;
import org.tbee.javafx.scene.layout.MigPane;

/**
 * Test miglayout managed and unmanaged nodes
 * @author Tom Eugelink
 *
 */
public class MigPaneTest4 extends Application {

    public static void main(String[] args) {
    	launch(args);
    }

	@Override
	public void start(Stage stage) {

        // root
        MigPane lRoot = new MigPane(new LC(), new AC(), new AC());

        // add managed nodes
        lRoot.add(new TextField(), new CC());
        lRoot.add(new Rectangle(30,30, Color.RED), new CC());

		// add external (not unmanaged..) nodes
		Rectangle rectangle = new Rectangle(100, 50, 30, 30);
		lRoot.add(rectangle, new CC().external());

        // create scene
        Scene scene = new Scene(lRoot, -1, -1);

        // create stage
        stage.setTitle("Test");
        stage.setScene(scene);
		stage.sizeToScene();
        stage.show();
    }

}