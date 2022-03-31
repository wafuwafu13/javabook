package com.java.book.app;

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Maven�̃T���v���v���O�����B
 */
public class App {

    /** �v���p�e�B�t�@�C�� */
    private static final String PROPERTY_FILE = "/book.properties";

    /**
     * �G���g���[�|�C���g�B
     */
    public static void main(String... args) {
        App app = new App();
        Properties properties = app.loadProperties(PROPERTY_FILE);
        app.printProperties(properties);
    }

    /**
     * �v���p�e�B�t�@�C����ǂݍ��ށB
     *
     * @param file �v���p�e�B�t�@�C���̃p�X
     * @return �v���p�e�B�I�u�W�F�N�g
     */
    protected Properties loadProperties(String file) {
        Properties properties = new Properties();
        try (Reader reader = new InputStreamReader(
                App.class.getResourceAsStream(file), StandardCharsets.UTF_8)) {
            properties.load(reader);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return properties;
    }

    /**
     * �v���p�e�B�t�@�C���̒��g��\������B
     *
     * @param properties �v���p�e�B�I�u�W�F�N�g
     */
    protected void printProperties(Properties properties) {
        if (properties != null) {
            Enumeration<?> names = properties.propertyNames();
            while (names.hasMoreElements()) {
                String name = String.valueOf(names.nextElement());
                String value = properties.getProperty(name);
                System.out.println(name + " : " + value);
            }
        }
    }

}