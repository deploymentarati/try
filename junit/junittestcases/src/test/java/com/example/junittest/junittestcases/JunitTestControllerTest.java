package com.example.junittest.junittestcases;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class JunitTestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloWorldEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.content().string("Hello, World!"));
    }

    @Test
    public void testNonexistentEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/nonexistent"))
               .andExpect(MockMvcResultMatchers.status().isNotFound());
    }
}

