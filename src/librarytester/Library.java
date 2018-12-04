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
public class Library {
  //The library will contain books stored in an array

  private Book libBooks[];

  public Library() {
    fillBooks();
  }

  public void fillBooks() {
    //Ask how many books to fill
    String myInput = JOptionPane.showInputDialog(
      "How many books would you like to create?");
    int numBooks = Integer.parseInt(myInput);

    libBooks = new Book[numBooks];

    String title, author;

    for (int i = 0; i < numBooks; i++) {
      title = JOptionPane.showInputDialog("Book " + (i + 1) 
        + " Title");
      author = JOptionPane.showInputDialog("Book " + (i + 1)
        + " Author");
      //Create the individual book object
      libBooks[i] = new Book(title, author);
    }
    //Finished creating the books
  }

  public void checkOutBook(int num, String name) {
    if (libBooks[num].isOut() == true) {
      JOptionPane.showMessageDialog(null, 
        "This book is already out!");
    } else {
      libBooks[num].setIsOut(true);
      libBooks[num].setCheckOutName(name);
    }
  }

  public void returnBook(int num) {
    if (libBooks[num].isOut() == false) {
      JOptionPane.showMessageDialog(null, 
        "This book is already returned!");
    } else {
      libBooks[num].setIsOut(false);
      libBooks[num].setCheckOutName("");
    }
  }

  public String toString() {
    String output = "";
    output += "Library Contains:\n";
    //print each book out
    for (int i = 0; i < libBooks.length; i++) {
      output += "Book #" + i + "\n";
      output += libBooks[i].toString() + "\n";
    }
    return output;
  }
    
}
