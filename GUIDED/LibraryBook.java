/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package GUIDED;

/**
 *
 * @author User
 */
public class LibraryBook {
    private String title;
    private String author;
    private boolean isBorrowed; 

    public LibraryBook() {
        this.title = "";
        this.author = "";
        this.isBorrowed = false;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsBorrowed() { 
        return isBorrowed;
    }

    // Menambahkan metode getStatus()
    public String getStatus() {
        return isBorrowed ? "Borrowed" : "Available";
    }
}


