def solution(my_string):
    answer = [0]*52
    for i in range(len(my_string)):
        if ord(my_string[i]) >= 65 and ord(my_string[i]) <= 90:
            answer[ord(my_string[i])-65]+=1
        else:
            answer[ord(my_string[i])-97+26]+=1
    return answer