# Python syntax

### List
```
list = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday"]

# sort list
list.sort()
print(list)

# reverse list
list.reverse()
print(list)

# append element to list
list.append("Saturday")
print(list)

# insert element to list at specific index-1
list.insert(-1, "Sunday")
print(list)

# pop element from list at specific index. defaults to last element
list.pop()
print(list)

# length of list
print(len(list))

# returns a sorted list. Doesn't sort the original list
print(sorted(list, reverse=True))

# Remove element from list
list.remove("Friday")
print(list)

# Count occurences of element in list
print(list.count("Tuesday"))

# empties the list
list.clear()
print(list)
```

### String
```
string = "Hello world"

# length of string
print(len(string))

# Capitalise the string
print(string.upper())

# lower case the string
print(string.lower())

# find occurece of the string in the original string and return start index of occurence
print(string.find("rld"))

# concat string. Doesn't mutate the variable
print(string + "!!!")

# replace all occurences of a string
print(string.replace("l","L"))

# split string with delimitter
print(string.split(" "))

# join list elements with delimitter
print(("+").join(["a","b","c"]))
```

