def solution(name, yearning, photo):
    score_dict = dict(zip(name, yearning))
    
    result = []
    
    for p in photo:
        total = 0
        for person in p:
            total += score_dict.get(person, 0)
        result.append(total)
    
    return result