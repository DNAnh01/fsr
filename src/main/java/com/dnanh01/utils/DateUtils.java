package com.dnanh01.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Objects;

public class DateUtils {
    private static SimpleDateFormat simpleDateFormat = null;

    private DateUtils() {
    }

    public static java.sql.Date toSqlDate(LocalDate localDate) {
        Objects.requireNonNull(localDate, "local date cannot be null !!!");
        return java.sql.Date.valueOf(localDate);
    }

    public static java.util.Date toUtilDate(LocalDate localDate, String pattern) {
        Objects.requireNonNull(localDate, "local date cannot be null !!!");
        simpleDateFormat = new SimpleDateFormat(pattern);
        java.util.Date utilDate = null;
        try {
            utilDate = simpleDateFormat.parse(localDate.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return utilDate;
    }
}
