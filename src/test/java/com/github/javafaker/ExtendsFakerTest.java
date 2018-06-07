package com.github.javafaker;

import org.junit.Test;
import org.mockito.Spy;

import java.util.Locale;
import java.util.Random;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class ExtendsFakerTest extends AbstractFakerTest {

    @Spy
    protected ExtendFaker eFaker;

}
