package com.jmock.timeccache;

import java.util.Date;

public interface ReloadPolicy {

	boolean shouldReload(Date loadTime, Date fetchTime);

}
