https://www.javatpoint.com/javsa-hashset#:~:text=Java%20HashSet%20class%20is%20used,class%20and%20implements%20Set%20interface.&text=HashSet%20stores%20the%20elements%20by,HashSet%20allows%20null%20value
https://www.javatpoint.com/working-of-hashset-in-java


1. Intended use (what the collection is typically used for)
  Java HashSet class is used to create a collection that uses a hash table for storage. it is the best approach for search operations.
2. Mutability and Pros/Cons for the collection (what can or can't it do?)
  It allows null value. you can add elements, clear all the elements, clone the elements, Booleans to check whether the set is empty, remove an element, find the size of the set and etc.
  However, it does not maintain the insertion order, elements are inserted on the basis of their hashcode.
3. Import Statement required for the specific collection
  import java.util.HashSet;
  import java.util.Set;
4. Necessary code to create/instantiate the collection
  the constructor is HashSet()
  HashSet<String> set=new HashSet(); //that's an example
5. Code to populate the collection  (including what is needed to load information from a file where 6. applicable)
  HashSet(int capacity);
6. Code to find the length, size, or element count
  To find the size of the set, use size();
7. Code to add to the collection
  add(); //that is the code to add an element to the set that has been created.
8. Code to update an element
  there is no such code that can change or update an element, to do so, you would have to remove an element then add one.
9. Code to remove, clear, or delete the element (based on mutability)
  remove(object); //remove something when it's in the set.
10. Code the print the entire collection to the console
  iterator(); //it will return an iterator over the elements in the set.
11. CHALLENGE: Code to order the collection (Alpha or Numeric sort)
  there is no such thing that can be done in this set.
