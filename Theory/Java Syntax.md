# Java Syntax

### For comments
``` 
// This is a single line comment in Java
```
``` 
/*
    This is a multiline comment in Java
*/
```

### Print
```
// Doesn't end with new line char. Output will be Hello world%
System.out.print("Hello world");

// Ends with new line char
System.out.println("Hello world");
```
```
int i = 0;

// This will give output as 0. No need to convert or type cast
System.out.println(i);

// This will give output as Hello world 0
System.out.println("Hello world " + i)
```

### String methods
```
String samplestring = "Hari Rahul R";

// Print length of String. Output = 12
System.out.println(samplestring.length());

// Print char located at certain Index. Output = i
System.out.println(samplestring.charAt(3));

// Print concatenated string. Output = Hari Rahul R is paavam
System.out.println(samplestring.concat(" is paavam"));

// Check if Strings are equal. Output = false
System.out.println(samplestring.equals("Hari Rahul Rajkumar"));
        
// Print the index of first occurence of a char in the String. Output = 7
System.out.println(samplestring.indexOf("h"));

// Print substring from given String. Output = ari
System.out.println(samplestring.substring(1, 5));

/* Split the given string based on a delimitter.
Output = Hari
         Rahul
         R
*/
String[] splitString = samplestring.split(" ");

for (String j : splitString) {
    System.out.println(j);
}
*/

// Print joined string with specific delimitter
System.out.println(String.join(" ! ", splitString));
```

### Arrays
```
String[] stringArray = {"a", "b", "c"};

// Print length of array
System.out.println(stringArray.length);

// Print element at location 2. Output = c
System.out.println(stringArray[2]);

String[][] string2dArray = {{"a","A"}, {"b","B"}, {"c","C"}};

// Print length of array
System.out.println(string2dArray.length);
        
// Print element at location 0,1. Output = A
System.out.println(string2dArray[0][1]);

// Print the elements. Output = A\nB\nC
for (String[] j : string2dArray){
    System.out.println(j[1]);
}
```

### ArrayList
```
// Declare an array list
ArrayList<Integer> arrayList = new ArrayList<>();

// Add elements to the array list
arrayList.add(1);
arrayList.add(2);
arrayList.add(3);

// Print the elemnts in the array list
for (int j : arrayList){
    System.out.println(j);
}

// Print Size of array list
System.out.println(arrayList.size());

// Remove elemnt from specific index
System.out.println(arrayList.remove(2));

// Retrieve element from specific index
System.out.println(arrayList.get(0));

// Verify if certain element is present in the array List
System.out.println(arrayList.contains(1));
```

### Set
```
// Declare Set
Set<String> setString = new HashSet();

// Add elements to a set
setString.add("Monday");
setString.add("Tuesday");

// Size of set
setString.size();

// Print all unique elements in set
for (String j : setString){
    System.out.println(j);
}

setString.add("Monday");

// Remove element from set
setString.remove("Monday");
```

### HashMap
```
// Declare hashmap
HashMap<Integer, String> hashMap = new HashMap<>();

// Initialise it with values
hashMap.put(1, "January");
hashMap.put(2, "February");
hashMap.put(3, "March");
hashMap.put(4, "April");

// Size of hashmap
hashMap.size();

// Keys of hashmap
System.out.println(hashMap.keySet());

// Values of hashmap
System.out.println(hashMap.values());

// Remove entry from hashmap using key
System.out.println(hashMap.remove(4));

// Get value from hashmap
System.out.println(hashMap.get(1));

// Verify if hashmap contains key
System.out.println(hashMap.containsKey(2));

// Verify if hashmap contains value
System.out.println(hashMap.containsValue("April"));

// Print all values stored in hashmap
for (Integer month : hashMap.keySet()){
    System.out.println(hashMap.get(month));
}
```

### Linked list
```
// Declare Linked list
LinkedList<String> linkedList = new LinkedList<>();

// Add values to linked list
linkedList.add(0,"Monday");
linkedList.add("Tuesday");
linkedList.add("Wednesday");
linkedList.add("Thursday");

// remove last element in Linked list
System.out.println(linkedList.removeLast());

// Size of linked list
System.out.println(linkedList.size());

// Remove element from linked list at specific index
System.out.println(linkedList.remove(1));

// Print all values in linked list
for (String j : linkedList){
    System.out.println(j);
}
```