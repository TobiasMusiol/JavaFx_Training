package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.util.Random;


public class Controller {

    @FXML private TextField pwout = null;
    @FXML private RadioButton n = null;
    @FXML private RadioButton cl = null;
    @FXML private RadioButton cu = null;
    @FXML private TextField pwLengthText = null;

    @FXML private void createPW(javafx.scene.input.MouseEvent mouseEvent) {
        Random rand = new Random();
        StringBuilder pw = new StringBuilder();
        String s = this.createRandomsString();
        Integer x = 0;

        try {
            Integer pwLength = Integer.parseInt(pwLengthText.getText());
            if(!s.isEmpty() && pwLength > 0){
                for(int i = 0; i < pwLength; i++){
                    x = rand.nextInt(s.length());
                    pw.append(s.charAt(x));
                }
                pwout.setText(pw.toString());
            }
            else pwout.setText("");
        }catch (Exception e){
            pwout.setText("Password length is not valid!");
        }




    }

    /**Class crateRandomString()
     * pramameter: none
     * return: none
     *
     * Description:
     * Checks if Radiobuttons n, cl or cu are enabled, then
     * then numerics, alphabetics lower case or alphabetics upper case
     * are added to pool of characters for nonce generation.
     *
     * */
    private String createRandomsString(){
        StringBuilder s = new StringBuilder();
        String numb = "0123456789";
        String lowCase = "abcdefghijklmnopqrstuvwxyz";
        String upCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if(n.isSelected()) s.append(numb);
        if(cl.isSelected()) s.append(lowCase);
        if(cu.isSelected()) s.append(upCase);

        return s.toString();
    }
}
