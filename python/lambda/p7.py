tables = []
tables.append(lambda : 1 * 10)
tables.append(lambda : 2 * 10)


for table in tables:
    print(table())
