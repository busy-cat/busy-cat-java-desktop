/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package xyz.dsemikin.busycat.desktop.app;

import xyz.dsemikin.busycat.desktop.list.LinkedList;

import static xyz.dsemikin.busycat.desktop.utilities.StringUtils.join;
import static xyz.dsemikin.busycat.desktop.utilities.StringUtils.split;
import static xyz.dsemikin.busycat.desktop.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
