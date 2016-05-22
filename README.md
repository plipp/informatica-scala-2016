scala-Workshop: Basics
======================

I. What is this all about?
--------------------------
Scala is a programming language, which tries to bring together object oriented programming with functional programming.
It's more and more used to realize high availabe and scalable systems and it's the driving language for Reactive Programming (Akka, Play), 
Big Data Processing (Spark), ...

This workshop introduces in the basics of Scala: We will learn interactively about 

* Types, Variables
* Methods
* Pattern Matching
* Loops und Control Structures
* Collection API

... and we will apply our new knowledge to send out bots in [Scalatron](https://scalatron.github.io/).

II. Scalatron
--------------
- [Scalatron Game Rules](https://github.com/plipp/scalatron/blob/master/Scalatron/doc/markdown/Scalatron%20Game%20Rules.md)
- [Scalatron Game Protocol](https://github.com/plipp/scalatron/blob/master/Scalatron/doc/markdown/Scalatron%20Protocol.md)


III. Front-Up Preparations
-------------------------

As this is a notebook class, you should try to set up your machine before we start with the actual workshop.

There are 2 options to do so:

* Option1: Install Scala and IntelliJ (an Integrated Development Environment (IDE)) directly on your computer
* Option2: Install Virtualbox on your computer, download an already prepared Ubuntu-Box and run it

*Attention*:
The IDE must be IntelliJ (not e.g. ScalaIDE, Eclipse...), because the orksheets only run under IntelliJ!

Here a description, how both options work, in more detail:

### Option 1 - the hard way
0. [Scala Workshop Sources and Documentation](https://TODO*): check it out: `git clone git@github.com:plipp/informatica-scala-2016.git`

1. [IntelliJ IDEA 2016.1 Help /Installing and Launching](https://www.jetbrains.com/help/idea/2016.1/installing-and-launching.html?search=install#d1790162e138)
   Please also install the Scala Plugin

2. If you already have installed IntelliJ, but not the Scala Plugin: 
   [Install it now!](http://stackoverflow.com/questions/26767463/intellij-14-create-import-a-scala-sbt-project)
   (This also should work for IntelliJ-2016)
   
3. Import the scala workshop project into IntelliJ: `informatica-scala-2016/build.sbt`
   ... can take some time as it downloads the whole internet ...

4. Expected Result: Worksheets (*.sc) and tests can directly be run in IntelliJ

5. TODO Getting Started with Scalatron ...

### Option 2 - the easy(ier) way

TODO: Install Virtualbox + image

### Further Links about IntelliJ for Scala

- https://www.jetbrains.com/help/idea/2016.1/scala.html
- For Courserians only: https://class.coursera.org/reactive-002/wiki/IntelliJ_IDEA



IV. Scala - Help for Self-Help
------------------------------
- [Scala Glossary Typesafe](http://docs.scala-lang.org/glossary/?_ga=1.237881024.1946458768.1438599324)

- [Scala CheatSheet Typesafe with GOOD-BAD](http://docs.scala-lang.org/cheatsheets/?_ga=1.39644259.1946458768.1438599324)
- [Scala CheatSheet Coursera](https://github.com/lampepfl/progfun-wiki/blob/gh-pages/CheatSheet.md)

- [Scala-Api-Documentation](http://www.scala-lang.org/api/current/#package)


- REPL (=Read Evaluate Print Loop): *$>sbt console*
- IntelliJ-Worksheets


V. What's Next
---------------

### Resources
- [Lightbend (former Typesafe): eBooks, Webinars, Videos ...](https://www.lightbend.com/)
- Another Introduction: [Scala School!](http://twitter.github.io/scala_school/)
- Inspired by Effective Java: [Effective Scala](http://twitter.github.io/effectivescala)

### Free Books
- Very Fast way (2012): [Scala for the Impatient](http://www.horstmann.com/scala/index.html)
- Comprehensive Guide: [The Neophyte's Guide to Scala](http://danielwestheide.com/scala/neophytes.html)
- Cookbook: [Online-Site for *Scala Cookbook*](http://alvinalexander.com/scala)
- Leading Authority: Martin Odersky, quite theoretical: [Programming in Scala (2013)](http://www.artima.com/shop/programming_in_scala_2ed), [free Online-Version (2008)](http://www.artima.com/pins1ed/)

### MOOC
- [Functional Programming Principles in Scala](https://www.coursera.org/course/progfun)
- [Functional Programming in Scala Specialization](https://www.coursera.org/specializations/scala)

### Playground
- [Scala Koans](http://scala-exercises.47deg.com/)
- [S-99: Ninety-Nine Scala Problems](http://aperiodic.net/phil/scala/s-99/)


X. TODO
------------------
- Do we need info about
    - markdown --> link
    - git --> Tutoriallink
    - what else???