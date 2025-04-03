package org.korosoft.jenkins.plugin.rtp.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for WikiText markup parser
 *
 * @author Dmitry Korotkov
 * @since 1.0
 */
class ConfluenceMarkupParserTest {
    private ConfluenceMarkupParser parser;

    @BeforeEach
    void setUp() {
        parser = new ConfluenceMarkupParser();
    }

    @Test
    void testHeader() throws Exception {
        String text = parser.parse("h1. Hello");
        assertTrue(text.contains("<h1"), "HTML Text for h1. should contain <h1> tag");
    }
}
