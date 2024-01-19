class QuickFindUF:

    def __init__(self, N):
        self.id = []
        for i in range(N):
            self.id.append(i)
    
    def connected(self, p: int, q: int)-> bool:
        return self.id[p] == self.id[q]

    def union(self, p: int , q: int):
        pid = self.id[p]
        qid = self.id[q]

        for i in range(len(self.id)):
            if self.id[p] == pid:
                self.id[p] = qid


qf = QuickFindUF(10)
print(qf.connected(1,2))
qf.union(1,2)
print(qf.connected(1,2))
