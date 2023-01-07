package com.ppomppu.study;

import org.junit.Test;

import static org.junit.Assert.*;

import android.util.Base64;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
class EmojiContainer{
    String serialize(){
        return "SE";
    }
}
public class ExampleUnitTest {

    @NonNull
    private String encodeEmojiContainer(@NonNull EmojiContainer container) {
        //return Base64.encodeToString(container.serialize(), Base64.DEFAULT);
        return "";
    }
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void test1(){


//
//        @Nullable
//        private EmojiContainer decodeEmojiContainer(@NonNull String data) {
//            byte[] array = Base64.decode(data, Base64.DEFAULT);
//            return EmojiContainer.buildFromSerializedData(array);
//        }



    }

}