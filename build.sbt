ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.gwgs"
ThisBuild / scalaVersion := "2.13.14"

val langchain4jVersion = "0.36.0"  // adjust to latest

lazy val root = (project in file("."))
  .settings(
    name := "scala-langchain4j",
    libraryDependencies ++= Seq(
      // Core library (required)
      "dev.langchain4j" % "langchain4j" % langchain4jVersion,

      // Pick ONE (or more) LLM provider
      // "dev.langchain4j" % "langchain4j-open-ai" % langchain4jVersion,   // OpenAI / Azure
      "dev.langchain4j" % "langchain4j-ollama"   % langchain4jVersion,   // local Ollama models
      // "dev.langchain4j" % "langchain4j-anthropic" % langchain4jVersion, // Claude
      // "dev.langchain4j" % "langchain4j-bedrock"  % langchain4jVersion, // AWS Bedrock

      // Optional: embedding model (often included in provider above, but explicit if needed)
      // "dev.langchain4j" % "langchain4j-embeddings" % langchain4jVersion, // if separate

      // Optional: a vector store (for RAG)
      // "dev.langchain4j" % "langchain4j-chroma" % langchain4jVersion,
      // "dev.langchain4j" % "langchain4j-pgvector" % langchain4jVersion,

      // Logging (recommended — LangChain4j uses SLF4J)
      "org.slf4j" % "slf4j-api" % "2.0.16",
      "ch.qos.logback" % "logback-classic" % "1.5.6" % Runtime
    )
  )
