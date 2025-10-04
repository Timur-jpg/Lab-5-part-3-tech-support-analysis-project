TechSupport - the DodgySoft Technical support system.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.


This project implements a technical support system for customers of the 
DodgySoft software company. Users can describe their software problems and 
get advice instantly!

The idea is based on Eliza - a famous program described by Joseph Weizenbaum 
in 1966. (Do a web search for "Eliza" and "Weizenbaum" if you want to know 
more about this.)

In fact, it is much more primitive than Eliza. But that's enough to match the 
quality of many software companies' technical support advice...  ;-)

To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

The purpose of this project is to demonstrate and study library classes, such 
as ArrayList, HashMap, HashSet, and Random.


Answers

43. The putIfAbsent method of a HashMap adds a key-value pair only if the key is not already in the map. If the key exists, it does nothing and keeps the existing value.

46. Yes, it is accurate.
    It is mostly complete some methods or classes do not have Javadoc comments, the documentation only shows their names and signatures without descriptions.
    Class summaries, method overviews, method parameters and return types are all useful.
    Private fields and helper methods with no comments are less useful.
    No, I didn't find any errors in the documentation?

47. @author and @version appear at the top of the class page.
    @param creates a table/list describing method parameters.
    @return adds a description of the method’s return value.
 
48. @see refers to a related class, method, or field.
    @throws / @exception describes exceptions a method can throw.
    @deprecated marks a class or method as outdated; suggests alternatives.
    
