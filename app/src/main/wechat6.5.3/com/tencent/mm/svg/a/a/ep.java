package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class ep extends c {
    private final int height = 96;
    private final int width = 96;

    protected final int j(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.d(looper);
                c.c(looper);
                Paint g = c.g(looper);
                g.setFlags(385);
                g.setStyle(Style.FILL);
                Paint g2 = c.g(looper);
                g2.setFlags(385);
                g2.setStyle(Style.STROKE);
                g.setColor(WebView.NIGHT_MODE_COLOR);
                g2.setStrokeWidth(1.0f);
                g2.setStrokeCap(Cap.BUTT);
                g2.setStrokeJoin(Join.MITER);
                g2.setStrokeMiter(4.0f);
                g2.setPathEffect(null);
                c.a(g2, looper).setStrokeWidth(1.0f);
                g = c.a(g, looper);
                g.setColor(-8617851);
                canvas.save();
                g = c.a(g, looper);
                Path h = c.h(looper);
                h.moveTo(32.0f, 28.0f);
                h.lineTo(85.0f, 28.0f);
                h.lineTo(85.0f, 20.0f);
                h.lineTo(32.0f, 20.0f);
                h.lineTo(32.0f, 28.0f);
                h.close();
                h.moveTo(12.0f, 28.0f);
                h.lineTo(24.0f, 28.0f);
                h.lineTo(24.0f, 20.0f);
                h.lineTo(12.0f, 20.0f);
                h.lineTo(12.0f, 28.0f);
                h.close();
                h.moveTo(32.0f, 52.0f);
                h.lineTo(85.0f, 52.0f);
                h.lineTo(85.0f, 44.0f);
                h.lineTo(32.0f, 44.0f);
                h.lineTo(32.0f, 52.0f);
                h.close();
                h.moveTo(12.0f, 52.0f);
                h.lineTo(24.0f, 52.0f);
                h.lineTo(24.0f, 44.0f);
                h.lineTo(12.0f, 44.0f);
                h.lineTo(12.0f, 52.0f);
                h.close();
                h.moveTo(32.0f, 77.0f);
                h.lineTo(85.0f, 77.0f);
                h.lineTo(85.0f, 69.0f);
                h.lineTo(32.0f, 69.0f);
                h.lineTo(32.0f, 77.0f);
                h.close();
                h.moveTo(12.0f, 77.0f);
                h.lineTo(24.0f, 77.0f);
                h.lineTo(24.0f, 69.0f);
                h.lineTo(12.0f, 69.0f);
                h.lineTo(12.0f, 77.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, g);
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}