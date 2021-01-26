package com.halmaks.tasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static com.halmaks.tasks.Prefix.searchWithPrefix;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrefixTest {

    @org.junit.jupiter.api.Test
    void searchWithPrefixCase1() {
        assertEquals(new ArrayList<>(Arrays.asList(0, 1, 2, 5)),
                searchWithPrefix(new String[]{
                                "yaservice", "ya.ru",
                                "yandex", "google.com",
                                "mail.ru", "yandex.ru"
                        },
                        "ya")
        );
    }

    @org.junit.jupiter.api.Test
    void searchWithPrefixCase2() {
        assertEquals(new ArrayList<>(Arrays.asList(0, 1, 2)),
                searchWithPrefix(new String[]{
                                "yaservice", "ya.ru",
                                "yandex"
                        },
                        "ya")
        );
    }

    @org.junit.jupiter.api.Test
    void searchWithPrefixCase3() {
        assertEquals(new ArrayList<>(Arrays.asList(0, 3)),
                searchWithPrefix(new String[]{
                                "ayaservice", "ya.ru",
                                "yandex", "agoogle.com",
                                "mail.ru", "yandex.ru"
                        },
                        "a")
        );
    }

    @org.junit.jupiter.api.Test
    void searchWithPrefixCase4() {
        assertEquals(new ArrayList<>(Arrays.asList(0, 5)),
                searchWithPrefix(new String[]{
                                "yaservice", "ya.ru",
                                "yandex", "google.com",
                                "mail.ru", "yasndex.ru"
                        },
                        "yas")
        );
    }

    @Test
    void searchWithPrefixCase5() {
        assertEquals(new ArrayList<>(Arrays.asList(3)),
                searchWithPrefix(new String[]{
                                "yasniypenservice", "ya.ru",
                                "yasniypendex", "google.com",
                                "mail.ru", "yasndex.ru"
                        },
                        "goog"
                ));
    }

    @Test
    void searchWithPrefixCase6() {
        assertEquals(new ArrayList<>(Arrays.asList(0, 2)),
                searchWithPrefix(new String[]{
                                "yasniypenservice", "ya.ru",
                                "yasniypendex", "google.com",
                                "mail.ru", "yasndex.ru"
                        },
                        "yasniypen")
        );
    }
}