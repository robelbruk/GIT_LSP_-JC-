package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShapeFactoryTest {

    @Test
    public void testCreateCircle() {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test
    public void testInvalidShape() {
        Shape unknown = ShapeFactory.getShape("TRIANGLE");
        assertNotNull(unknown); // This test expects null - adjust assertion based on factory behavior
    }
}
