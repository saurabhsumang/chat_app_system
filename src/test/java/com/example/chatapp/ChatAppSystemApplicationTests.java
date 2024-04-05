package com.example.chatapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
class ChatAppSystemApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@Test
	void webSocketConnection() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/app")).andExpect(MockMvcResultMatchers.status().isOk());
	}

}
