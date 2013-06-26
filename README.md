The Akin Programming Language
============================

What is it?
------------

The ability to read and write code is the literacy of the future. It's hard to achieve
a higher 'literacy' rate with the extremely foreign (to the general population) image
of programming.

Akin is a programming language that is intended to make learning how to program easier. 
The aim of the project is to create a programming language that has entirely clear, easy to
understand syntax in English. Flexibility, clarity, and simplicity are musts for the language
(yet to be achieved in any sense of the words). 

This is somewhat achieved through the lexer and parser along with a (right 
now very dumb, barely NLP) NLP algorithm. The language right now has somewhat flexible 
English syntax (take a look at the parser --- in ANTLR). 

The language chokes up extremely with classes and objects right now. Any nesting of 
'code blocks' or sentences also cause extremely slow run times.

Prerequisites
----------
* Ruby (1.8.7+ or probably most versions you would have)
* Java/JDK 1.7
* Apache Ant

Getting Started
---------------

First of all, get the repo and ```cd``` into it:
```
$ git clone http://github.com/brandontruong--/Akin.git
$ cd Akin
```
Then compile it:
```
$ ant
```

While in the same directory, try running the following for a pleasant surprise:
```
$ ./akin hello.akin
```

For some more samples go to the ```test``` directory.

To run them, do the above command but replace ```hello.akin``` with ```test/[CHOSEN FILE]```.

These should give you an OK (fine... pretty bad) feel for the syntax.

Some aims for the future
-------------------------

* Some adequate documentation
* Speeding up especially OOP stuff
* Some adequate documentation
* Adding more flexibility
* Some adequate documentation
* Javascript to Akin converter (far fetched idea...)
* Some adequate documentation.

Credits
-------
---
Created by Brandon Truong

Email: me@brandontruong.com <br />
Site: http://brandontruong.com

---

Based off of the example JVM language included in the book by Marc-André Cournoyer

Book: http://createyourproglang.com <br />
Site: http://macournoyer.com

License
-------
Apache 2.0


