package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class axn extends aqp {
    public String bCj;
    public String mUE;
    public String mUF;
    public String mUG;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.mUE != null) {
                aVar.e(2, this.mUE);
            }
            if (this.bCj != null) {
                aVar.e(3, this.bCj);
            }
            if (this.mUF != null) {
                aVar.e(4, this.mUF);
            }
            if (this.mUG == null) {
                return 0;
            }
            aVar.e(5, this.mUG);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mUE != null) {
                r0 += a.a.a.b.b.a.f(2, this.mUE);
            }
            if (this.bCj != null) {
                r0 += a.a.a.b.b.a.f(3, this.bCj);
            }
            if (this.mUF != null) {
                r0 += a.a.a.b.b.a.f(4, this.mUF);
            }
            if (this.mUG != null) {
                r0 += a.a.a.b.b.a.f(5, this.mUG);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            axn com_tencent_mm_protocal_c_axn = (axn) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_axn.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_axn.mUE = aVar3.pMj.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_axn.bCj = aVar3.pMj.readString();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_axn.mUF = aVar3.pMj.readString();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_axn.mUG = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
