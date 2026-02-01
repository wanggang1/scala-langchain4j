package com.gwgs

import dev.langchain4j.model.ollama.OllamaChatModel
import dev.langchain4j.data.message.UserMessage
import java.time.Duration

object Main {

  def main(args: Array[String]): Unit = {

    val model = OllamaChatModel.builder()
      .baseUrl("http://localhost:11434")
      .modelName("llama3.1")
      .timeout(Duration.ofMinutes(5))
      .temperature(1.2)
      .topP(0.9)
      .build()

    useModel(model)
  }

  private def useModel(model: OllamaChatModel): Unit = {
    val response = model.generate(
      UserMessage.from(
        "can you tell me some joke?"
      )
    )
    println(response.content().text())
  }
}
