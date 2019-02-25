package demo.study.com.studyproject.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.PathDashPathEffect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RemoteViews;

import demo.study.com.studyproject.R;

/**
 * Created by liuhe on 19-2-25.
 * 三种 Notification
 */

public class NotificationActivity extends Activity {

    /* 正常型 */
    private Button btNormal;
    /* 折叠型 */
    private Button btFold;
    /* 悬挂型 */
    private Button btSuspension;
    private NotificationManager notificationManager;
    private Notification.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_layout);

        btNormal = findViewById(R.id.bt_normal);
        btFold = findViewById(R.id.bt_fold);
        btSuspension = findViewById(R.id.bt_suspension);

        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        builder = new Notification.Builder(NotificationActivity.this);
        Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
        final PendingIntent pendingIntent = PendingIntent.getActivity(NotificationActivity.this,
                0, mIntent, 0);
        builder.setContentIntent(pendingIntent);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        builder.setAutoCancel(true);

        btNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setContentTitle("普通通知");
                notificationManager.notify(0, builder.build());
            }
        });

        btFold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*和普通Notification不同的是,我们需要自定义视图,而这个视图显示的进程和
                  我们创建视图的进程不在一个进程,所以我们需要使用RemoteViews。首先要使用RemoteViews来创建我们
                  的自定义视图*/

                //用RemoteViews来创建自定义的Notification视图
                builder.setContentTitle("折叠式通知");
                RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.view_fold);
                Notification notification = builder.build();
                notification.bigContentView = remoteViews;
                notificationManager.notify(1, notification);

            }
        });

        btSuspension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* 和前两种Notification不同的是,
                   它需要调用setFullScreenIntent来将Notification变为悬挂式Notification */

                builder.setContentTitle("悬挂式通知");
                builder.setFullScreenIntent(pendingIntent, true);
                notificationManager.notify(2, builder.build());
            }
        });

        /**
         * 备注：Android 5.0加入了一种新的模式Notification的显示等级,共有以下3种。
         • VISIBILITY_PUBLIC:任何情况都会显示通知。
         • VISIBILITY_PRIVATE:只有在没有锁屏时会显示通知。
         • VISIBILITY_SECRET:在pin、password等安全锁和没有锁屏的情况下才能够显示通知。
         • 设置非常简单,只要调用setVisibility方法就可以了
         */
    }
}
