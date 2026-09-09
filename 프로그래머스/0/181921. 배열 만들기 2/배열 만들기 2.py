def solution(l, r):
    answer = []  
    valid = True
    for i in range (l, r+1):
        string = str(i)
        valid = True
        
        for x in string:
            if x != "0" and x != "5":
                valid = False
                
        if valid:            
            answer.append(i)  
            
    if len(answer) == 0:
        answer.append(-1)
        
    return answer