package com.l.jmstudio.rmd;
import android.content.*;
import android.widget.*;

public class Receiver extends BroadcastReceiver
{

	@Override
	public void onReceive(Context p1, Intent p2)
	{
    
    boolean b;
    if(p2!=null&&p2.getExtras()!=null){
	b=p2.getExtras().getBoolean("jmstudios.bundle.key.FILTER_IS_ON");
	if(b){
	Toast.makeText(p1, "red moon enable", Toast.LENGTH_LONG).show();
	}else{
	Toast.makeText(p1, "red moon disable", Toast.LENGTH_LONG).show();
	}
	}
	
	}

}
