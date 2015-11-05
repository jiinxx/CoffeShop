package com.af.coffeshop.web.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static junit.framework.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HelloControllerTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testIndex() throws Exception {
        final MockMvc build = MockMvcBuilders.standaloneSetup(controller()).build();
        MvcResult mvcResult = build.perform(get("/")).andExpect(status().isOk()).andReturn();
        assertEquals(HelloController.GREETINGS_FROM_SPRING_BOOT,mvcResult.getResponse().getContentAsString());
    }

    private HelloController controller() {
        return new HelloController();
    }
}