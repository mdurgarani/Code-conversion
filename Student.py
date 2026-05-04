# List of students: (Name, Marks)
students = [
    ("Ravi", 85),
    ("Anu", 92),
    ("Kiran", 78),
    ("Meena", 90)
]

# Sort students based on marks (ascending order)
sorted_students = sorted(students, key=lambda x: x[1])

print("Students sorted by marks (ascending):")
for name, marks in sorted_students:
    print(name, "-", marks)
