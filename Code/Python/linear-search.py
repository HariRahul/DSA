def linearSearch(searchSpace, searchElement):
    for element in searchSpace:
        if element == searchElement:
            print("Element found")
            return True
        else:
            continue
    
    print("Element {} not found".format(searchElement))
    return False
        
linearSearch('Hello World', 'A')
linearSearch([1,2,3,4,5,6,7,8,9], 5)