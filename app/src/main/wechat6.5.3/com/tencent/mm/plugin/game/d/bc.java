package com.tencent.mm.plugin.game.d;

import com.tencent.mm.ba.a;

public final class bc extends a {
    public String gkv;
    public boolean gne;
    public String gnf;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            aVar.ab(1, this.gne);
            if (this.gnf != null) {
                aVar.e(2, this.gnf);
            }
            if (this.gkv != null) {
                aVar.e(3, this.gkv);
            }
            return 0;
        } else if (i == 1) {
            r0 = (a.a.a.b.b.a.cw(1) + 1) + 0;
            if (this.gnf != null) {
                r0 += a.a.a.b.b.a.f(2, this.gnf);
            }
            if (this.gkv != null) {
                return r0 + a.a.a.b.b.a.f(3, this.gkv);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            bc bcVar = (bc) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bcVar.gne = aVar3.bQJ();
                    return 0;
                case 2:
                    bcVar.gnf = aVar3.pMj.readString();
                    return 0;
                case 3:
                    bcVar.gkv = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
