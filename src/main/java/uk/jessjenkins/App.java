package uk.jessjenkins;

import java.net.URLConnection;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Testing mimetypes\n=================");


        System.out.println(guess("global.css"));
        System.out.println(guess("index.html"));
        System.out.println(guess("piccy.png"));
        System.out.println(guess("selfie.jpg"));
    }


    private static String guess(String filename) {
        return new StringBuilder(filename)
                .append(": ")
                .append(URLConnection.guessContentTypeFromName(filename))
                .toString();
    }
}