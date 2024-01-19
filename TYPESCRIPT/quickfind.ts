class QuickFindUF {
    private id: number[];
    constructor(N: number) {
        this.id = Array.from({ length: N }, (_, i) => i)
    }

    connected(p: number, q: number): boolean {
        return this.id[p] === this.id[q];
    }

    union(p: number, q: number): void {
        const pid: number = this.id[p];
        const qid: number = this.id[q]

        for (let i = 0; i < this.id.length; i++) {
            if (this.id[i] === pid) {
                this.id[i] = qid;
            }
        }
    }
}

const qf = new QuickFindUF(10);
console.log(qf.connected(1, 2))
qf.union(1, 2)
console.log(qf.connected(1, 2))