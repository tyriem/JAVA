/*
 * [LICENSE INFORMATION]
 * THIS WORK IS CURRENTLY NOT UNDER LICENSE, FOR MORE INFORMATION CONTACT ITS AUTHOR
 * [LICENSE INFORMATION]
 */
package ji.jfxsoundboard;

import java.io.File;
import javafx.scene.image.*;

/**
 *
 * @author T
 */
public class ImgController {
// Add this code where you want your image to appear
File imageFile = new File("");
Image image = new Image(imageFile.toURI().toString());
ImageView imageView = new ImageView(image);
// Now, you can add your new ImageView anywhere you'd like,
// such as in a layout page
}