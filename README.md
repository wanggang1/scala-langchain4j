# Scala + LangChain4j + Ollama

A simple Scala project that uses **LangChain4j** with **Ollama** to run a local AI model.

Everything runs on your machine.


---


## What This Project Does

- Uses **Scala**

- Talks to a **local Ollama model**

- Sends a prompt

- Prints the response


---


## What You Need

- Java 17+

- sbt

- Ollama installed

## Download Prerequisites

Before installing ***Ollama***, ***java17+*** and ***sbt*** make sure you have:

- macOS, Linux, or Windows
- An active internet connection
- (macOS only) Homebrew installed if using the Homebrew method


---


# Install Java (17+)

Java is required to run Scala and sbt. This project requires Java 17 or newer.

## Installation

You can install Java using either of the methods below.

### Option 1: Install with Homebrew (macOS)

This is the recommended method for macOS users.

```bash
brew install openjdk@17
```

After installation, link Java so it’s available system-wide:

```bash
brew link --force --overwrite openjdk@17
```

Verify the installation:

```bash
java -version
```

You should see version 17 or higher.

### Option 2: Download from the Official Website (All Platforms)

Open your browser and go to:
https://adoptium.net

Select Temurin 17 (LTS)

Download the installer for your operating system

Run the installer and follow the on-screen instructions

Restart your terminal

Verify the installation:

```bash
java -version
```

You should see version 17 or higher.


---


# Install sbt (Scala Build Tool)

sbt is the build tool used to compile and run Scala projects.

## Prerequisites

Before installing sbt, make sure you have:

Java 17 or newer installed


## Installation

You can install sbt using either of the methods below.

### Option 1: Install with Homebrew (macOS)

This is the recommended method for macOS users.

```bash
brew install sbt
```

Verify the installation:

```bash
sbt --version
```

### Option 2: Download from the Official Website (All Platforms)

Open your browser and go to:
https://www.scala-sbt.org/download.html

Download the installer for your operating system

Run the installer and follow the on-screen instructions

Restart your terminal

Verify the installation:

```bash
sbt --version
```

---


# Install Ollama

Ollama is a local AI runtime that allows you to download and run large language models directly on your machine. It is commonly used as a local backend for tools such as LangChain, LangChain4j, and custom AI applications.


## Installation

You can install Ollama using **either** of the methods below.



### Option 1: Install with Homebrew (macOS)

```bash
brew install ollama
```


### Option 2: Download from the Official Website (All Platforms)

Open your browser and go to:
https://ollama.com

Click Download

Choose the installer for your operating system

Run the installer and follow the on-screen instructions

After installation, restart your terminal so the ollama command is available.
