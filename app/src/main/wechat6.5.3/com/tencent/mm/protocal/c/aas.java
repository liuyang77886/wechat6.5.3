package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class aas extends aqx {
    public String mBW;
    public String mBY;
    public int mBZ;
    public String mCa;
    public int mym;
    public LinkedList<bgf> myn = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mQl == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.mQl != null) {
                aVar.dX(1, this.mQl.aHr());
                this.mQl.a(aVar);
            }
            aVar.dV(2, this.mym);
            aVar.d(3, 8, this.myn);
            if (this.mBY != null) {
                aVar.e(4, this.mBY);
            }
            if (this.mBW != null) {
                aVar.e(5, this.mBW);
            }
            aVar.dV(6, this.mBZ);
            if (this.mCa == null) {
                return 0;
            }
            aVar.e(7, this.mCa);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            r0 = (r0 + a.a.a.a.dS(2, this.mym)) + a.a.a.a.c(3, 8, this.myn);
            if (this.mBY != null) {
                r0 += a.a.a.b.b.a.f(4, this.mBY);
            }
            if (this.mBW != null) {
                r0 += a.a.a.b.b.a.f(5, this.mBW);
            }
            r0 += a.a.a.a.dS(6, this.mBZ);
            if (this.mCa != null) {
                r0 += a.a.a.b.b.a.f(7, this.mCa);
            }
            return r0;
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.myn.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = aqx.a(aVar2); r0 > 0; r0 = aqx.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mQl != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            aas com_tencent_mm_protocal_c_aas = (aas) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        eo eoVar = new eo();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = eoVar.a(aVar4, eoVar, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_aas.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_aas.mym = aVar3.pMj.mH();
                    return 0;
                case 3:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        bgf com_tencent_mm_protocal_c_bgf = new bgf();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_bgf.a(aVar4, com_tencent_mm_protocal_c_bgf, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_aas.myn.add(com_tencent_mm_protocal_c_bgf);
                    }
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_aas.mBY = aVar3.pMj.readString();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_aas.mBW = aVar3.pMj.readString();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_aas.mBZ = aVar3.pMj.mH();
                    return 0;
                case 7:
                    com_tencent_mm_protocal_c_aas.mCa = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
