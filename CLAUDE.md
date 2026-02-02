# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

A Scala project demonstrating LangChain4j integration with Ollama for local LLM interaction. The project uses Scala 2.13.14 and LangChain4j 0.36.0 to communicate with locally-hosted AI models via Ollama.

## Build Commands

**Compile the project:**
```bash
sbt compile
```

**Run the main application:**
```bash
sbt run
```

**Clean build artifacts:**
```bash
sbt clean
```

**Open interactive sbt shell:**
```bash
sbt
```

Within the sbt shell, you can run commands like `compile`, `run`, `clean`, etc. without the `sbt` prefix.

## Prerequisites

The application requires:
- Java 17 or newer
- sbt 1.11.7 (configured in project/build.properties)
- Ollama running locally at `http://localhost:11434`
- The `llama3.1` model pulled in Ollama

**Start Ollama (if not running as a service):**
```bash
ollama serve
```

**Pull the required model:**
```bash
ollama pull llama3.1
```

## Architecture

**Main Entry Point:**
- `src/main/scala/com/gwgs/Main.scala` - Single-file application that demonstrates basic LangChain4j usage

**LangChain4j Integration:**
The project uses `OllamaChatModel` from LangChain4j to interface with local Ollama models. The model is configured with:
- Base URL pointing to local Ollama instance
- Model name (currently `llama3.1`)
- Timeout, temperature, and topP parameters
- Uses `UserMessage` for prompt construction

**Dependency Management:**
The `build.sbt` file includes commented alternatives for different LLM providers (OpenAI, Anthropic, AWS Bedrock) and optional components (embeddings, vector stores like Chroma/pgvector). Currently only `langchain4j-ollama` is active.

**Package Structure:**
- Organization: `com.gwgs`
- Main package: `com.gwgs`
- No tests are currently present in the project

## Switching LLM Providers

To switch from Ollama to another provider, edit `build.sbt`:
1. Comment out the `langchain4j-ollama` dependency
2. Uncomment the desired provider (e.g., `langchain4j-open-ai`)
3. Update the model initialization in `Main.scala` to use the corresponding model class

## Model Configuration

The Ollama model configuration in `Main.scala:11-17` can be adjusted:
- `modelName`: Change to any model available in your local Ollama installation
- `timeout`: Default is 5 minutes
- `temperature`: Currently 1.2 (higher = more creative)
- `topP`: Currently 0.9 (nucleus sampling threshold)
