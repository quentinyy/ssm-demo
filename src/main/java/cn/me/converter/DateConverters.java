package cn.me.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverters implements Converter<String,Date>{
    public Date convert(String s) {

        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd:hh-mm-ss");
            return df.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
