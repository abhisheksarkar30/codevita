def primes(limit):

    D = {}
    q = 2

    while q <= limit:
        if q not in D:
            yield q
            D[q * 2] = [q]
        else:
            for p in D[q]:
                D.setdefault(p + q, []).append(p)
            del D[q]
        q += 1
limit=input()
p = primes(int(limit))
ps = [i/2 for i in p]
c=0
for pm in ps:
    p = pm
    for a in ps:
        p -= a
        if p == 0:
            c+=1
print(c-1)
            
