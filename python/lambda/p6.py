
tables = [lambda x=y: x*10 for y in range(1, 11)]

for table in tables:
    print(table())
