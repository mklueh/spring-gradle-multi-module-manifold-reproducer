package com.example.application;

import com.example.TestData;
import org.junit.jupiter.api.Test;

/**
 */
public class ManifoldTest {

    @Test
    public void test() {
        for (TestData.TestDataItem item : TestData.fromSource()) {
            System.out.println(item.getFirst());
        }
    }
}
