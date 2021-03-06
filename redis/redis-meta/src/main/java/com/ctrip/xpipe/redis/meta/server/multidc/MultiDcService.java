package com.ctrip.xpipe.redis.meta.server.multidc;

import com.ctrip.xpipe.redis.core.entity.KeeperMeta;

/**
 * @author wenchao.meng
 *
 * Dec 12, 2016
 */
public interface MultiDcService {
	
	KeeperMeta getActiveKeeper(String dcName, String clusterId, String shardId);

}
