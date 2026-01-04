package com.gwgs

import dev.langchain4j.model.input.PromptTemplate
import dev.langchain4j.model.openai.OpenAiChatModel
import dev.langchain4j.data.message.UserMessage
import scala.jdk.CollectionConverters._   // for .asJava

object Main {
  def main(args: Array[String]): Unit = {
    val apiKey = System.getenv("OPENAI_API_KEY")
    val model = OpenAiChatModel.builder().apiKey(apiKey).build()

    useModel(model)
    // useModelWithPrompt(model)
  }

  private def useModel(model: OpenAiChatModel): Unit = {
    val response = model.generate(UserMessage.from("Write a haiku about Scala programming language."))
    println(response.content().text())
  }

  private def useModelWithPrompt(model: OpenAiChatModel): Unit = {
    val template = PromptTemplate.from(
      """Write a haiku about {{topic}} in the style of {{style}}."""
    )

    val prompt = template.apply(
      Map(
        "topic" -> "Scala programming language",
        "style" -> "modern minimalist"
      ).asJava
    )

    val response = model.generate(UserMessage.from(prompt.text()))

    println(response.content().text())
  }

}