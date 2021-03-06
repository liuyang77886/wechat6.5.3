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

public final class bh extends c {
    private final int height = 480;
    private final int width = 481;

    protected final int j(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 481;
            case 1:
                return 480;
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
                canvas.save();
                g2 = c.a(g, looper);
                g2.setColor(-13917627);
                Path h = c.h(looper);
                h.moveTo(0.0f, 0.0f);
                h.lineTo(480.0f, 0.0f);
                h.lineTo(480.0f, 480.0f);
                h.lineTo(0.0f, 480.0f);
                h.lineTo(0.0f, 0.0f);
                h.close();
                canvas.drawPath(h, g2);
                canvas.restore();
                canvas.save();
                Paint a = c.a(g, looper);
                a.setColor(-1);
                Path h2 = c.h(looper);
                h2.moveTo(89.391014f, 121.6f);
                h2.cubicTo(87.73912f, 121.6f, 86.4f, 122.946335f, 86.4f, 124.594025f);
                h2.lineTo(86.4f, 355.40598f);
                h2.cubicTo(86.4f, 357.05954f, 87.73457f, 358.4f, 89.40565f, 358.4f);
                h2.lineTo(348.99435f, 358.4f);
                h2.cubicTo(350.65433f, 358.4f, 352.0f, 357.06567f, 352.0f, 355.39465f);
                h2.cubicTo(352.0f, 355.39465f, 351.99997f, 316.97693f, 352.0f, 295.25333f);
                h2.cubicTo(352.0f, 263.4904f, 393.6f, 241.3135f, 393.6f, 222.63467f);
                h2.cubicTo(393.6f, 204.11925f, 393.6f, 124.600876f, 393.6f, 124.600876f);
                h2.cubicTo(393.6f, 122.943535f, 392.26395f, 121.6f, 390.60898f, 121.6f);
                h2.lineTo(89.391014f, 121.6f);
                h2.close();
                h2.moveTo(102.4f, 137.6f);
                h2.lineTo(102.4f, 163.2f);
                h2.lineTo(137.6f, 163.2f);
                h2.lineTo(137.6f, 137.6f);
                h2.lineTo(102.4f, 137.6f);
                h2.close();
                h2.moveTo(198.4f, 137.6f);
                h2.lineTo(198.4f, 163.2f);
                h2.lineTo(233.6f, 163.2f);
                h2.lineTo(233.6f, 137.6f);
                h2.lineTo(198.4f, 137.6f);
                h2.close();
                h2.moveTo(150.4f, 137.6f);
                h2.lineTo(150.4f, 163.2f);
                h2.lineTo(185.6f, 163.2f);
                h2.lineTo(185.6f, 137.6f);
                h2.lineTo(150.4f, 137.6f);
                h2.close();
                h2.moveTo(294.4f, 137.6f);
                h2.lineTo(294.4f, 163.2f);
                h2.lineTo(329.6f, 163.2f);
                h2.lineTo(329.6f, 137.6f);
                h2.lineTo(294.4f, 137.6f);
                h2.close();
                h2.moveTo(246.4f, 137.6f);
                h2.lineTo(246.4f, 163.2f);
                h2.lineTo(281.6f, 163.2f);
                h2.lineTo(281.6f, 137.6f);
                h2.lineTo(246.4f, 137.6f);
                h2.close();
                h2.moveTo(342.4f, 137.6f);
                h2.lineTo(342.4f, 163.2f);
                h2.lineTo(377.6f, 163.2f);
                h2.lineTo(377.6f, 137.6f);
                h2.lineTo(342.4f, 137.6f);
                h2.close();
                h2.moveTo(102.4f, 316.8f);
                h2.lineTo(102.4f, 342.4f);
                h2.lineTo(137.6f, 342.4f);
                h2.lineTo(137.6f, 316.8f);
                h2.lineTo(102.4f, 316.8f);
                h2.close();
                h2.moveTo(198.4f, 316.8f);
                h2.lineTo(198.4f, 342.4f);
                h2.lineTo(233.6f, 342.4f);
                h2.lineTo(233.6f, 316.8f);
                h2.lineTo(198.4f, 316.8f);
                h2.close();
                h2.moveTo(150.4f, 316.8f);
                h2.lineTo(150.4f, 342.4f);
                h2.lineTo(185.6f, 342.4f);
                h2.lineTo(185.6f, 316.8f);
                h2.lineTo(150.4f, 316.8f);
                h2.close();
                h2.moveTo(294.4f, 316.8f);
                h2.lineTo(294.4f, 342.4f);
                h2.lineTo(329.6f, 342.4f);
                h2.lineTo(329.6f, 316.8f);
                h2.lineTo(294.4f, 316.8f);
                h2.close();
                h2.moveTo(246.4f, 316.8f);
                h2.lineTo(246.4f, 342.4f);
                h2.lineTo(281.6f, 342.4f);
                h2.lineTo(281.6f, 316.8f);
                h2.lineTo(246.4f, 316.8f);
                h2.close();
                WeChatSVGRenderC2Java.setFillType(h2, 2);
                canvas.drawPath(h2, a);
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}
