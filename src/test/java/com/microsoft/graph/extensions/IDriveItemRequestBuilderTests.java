package com.microsoft.graph.extensions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Method;

import org.junit.Test;

import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;

public class IDriveItemRequestBuilderTests {

	@Test
	public void testitemWithPath() throws Exception {
        final Method itemWithPath = DriveItemRequestBuilder.class.getDeclaredMethod("itemWithPath", String.class);
        assertNotNull(itemWithPath);
        assertEquals(DriveItemRequestBuilder.class, itemWithPath.getReturnType());
    }

}
