def solution(s):
    answer = True
    pp=0
    yy=0
    s = s.lower()
    
    for i in s:
        if i=='p':
            pp+=1
        elif i=='y':
            yy+=1
            
    return pp==yy
    
