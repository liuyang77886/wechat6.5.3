package com.tencent.mm.storage.a;

import com.tencent.mm.e.b.ao;
import com.tencent.mm.sdk.h.c.a;
import java.lang.reflect.Field;

public final class m extends ao {
    protected static a chq;

    static {
        a aVar = new a();
        aVar.ddU = new Field[2];
        aVar.bXK = new String[3];
        StringBuilder stringBuilder = new StringBuilder();
        aVar.bXK[0] = "productID";
        aVar.nmd.put("productID", "TEXT PRIMARY KEY ");
        stringBuilder.append(" productID TEXT PRIMARY KEY ");
        stringBuilder.append(", ");
        aVar.nmc = "productID";
        aVar.bXK[1] = "content";
        aVar.nmd.put("content", "BLOB default '' ");
        stringBuilder.append(" content BLOB default '' ");
        aVar.bXK[2] = "rowid";
        aVar.nme = stringBuilder.toString();
        chq = aVar;
    }

    protected final a tl() {
        return null;
    }
}
