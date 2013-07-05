package br.com.bsos.app.util;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Utils {

    public static String decoderText(String text) {
        try {
            byte[] bytes = text.getBytes("ISO-8859-1");
            text = new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return text;
        }

        return text;
    }

    public static String i18n(String text) {
        try {
            return ResourceBundle.getBundle("messages", Locale.getDefault()).getString(text);
        } catch (MissingResourceException e) {
            return "???" + text + "???";
        }
    }
}
