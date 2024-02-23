package com.dnanh01.utils;

import java.util.Objects;

import org.apache.commons.codec.digest.DigestUtils;

public class SqlUtils {
    private SqlUtils() {

    }

    public static void close(AutoCloseable... closeables) {
        for (AutoCloseable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String md5Hex(String password) {
        Objects.requireNonNull(password, "password cannot be null !!!");
        // encode password
        return DigestUtils.md5Hex(password);
    }
}
