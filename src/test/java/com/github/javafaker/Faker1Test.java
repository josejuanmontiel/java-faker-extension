package com.github.javafaker;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.Locale;
import java.util.Random;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Faker1Test {

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Spy
    protected ExtendFaker eFaker;

    @Test
    public void faker() {
        assertEquals(eFaker.faker1().faker(), "faker-extension");
    }

}
