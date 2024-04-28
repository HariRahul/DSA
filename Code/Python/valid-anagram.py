# Sort and compare two strings. Faster.
def isAnagram(self, s: str, t: str) -> bool:
        return sorted(s)==sorted(t)

# Keep track of char count using hashmap and compare both hashmaps.
def isAnagram(self, s: str, t: str) -> bool:
        hashMap = {}

        for c in s:
            if c in hashMap:
                hashMap[c]+=1
            else:
                hashMap[c]=1

        for c in t:
            if c in hashMap:
                hashMap[c]-=1
            else:
                return False

        for i in hashMap.values():
            if i != 0:
                return False
        
        return True