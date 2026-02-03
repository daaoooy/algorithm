grade_map = { 'A+': 4.5, 'A0': 4.0,
            'B+': 3.5, 'B0': 3.0,
            'C+': 2.5, 'C0': 2.0,
            'D+': 1.5, 'D0': 1.0,
            'F': 0.0 }

total_credit = 0.0
total_score = 0.0

line = 0

while line < 20:
    subject, credit, grade = input().split()
    
    line += 1
    credit = float(credit)

    if grade != 'P':
        total_credit += credit
        total_score += credit * grade_map[grade]

answer = total_score / total_credit
print(answer)