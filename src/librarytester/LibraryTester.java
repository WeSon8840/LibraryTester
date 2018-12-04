/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarytester;
import javax.swing.*;

/**
 *
 * @author glSon8840
 */
public class LibraryTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create the library that contains books
        Library myLibrary = new Library();

        String myInput = "";
        while (!myInput.equals("3")) {
            //Display Library
            System.out.println(myLibrary);

            myInput = JOptionPane.showInputDialog("Library Menu\n"
                + "1 - Checkout Book\n"
                + "2 - Return Book\n"
                + "3 - Exit");

        if (myInput.equals("1")) {
            String bookNum = JOptionPane.showInputDialog(
                "Which book # do you wish to check out?");
            int bNum = Integer.parseInt(bookNum);
            String bName = JOptionPane.showInputDialog(
                "What is the name of the person "
                + "checking out the book?");
            myLibrary.checkOutBook(bNum, bName);
        }

        if (myInput.equals("2")) {
            String bookNum = JOptionPane.showInputDialog(
                "Which book # do you wish to return?");
            int bNum = Integer.parseInt(bookNum);
            myLibrary.returnBook(bNum);
        }
       }
    }
    
}
