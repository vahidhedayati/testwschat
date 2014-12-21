package grails.plugin.wschat.myclient

import grails.plugin.wschat.client.WsChatClientService

import javax.websocket.Session



public  class MyChatClientService extends WsChatClientService {

	@Override
	public void processAct(Session userSession, boolean pm,String actionthis, String sendThis,
		String divId, String msgFrom, boolean strictMode) {
		if (pm) {
			if (strictMode==false) {
				userSession.basicRemote.sendText("|_____|>>"+sendThis)
			}
			userSession.basicRemote.sendText("/pm ${msgFrom},${sendThis}")
		}else{
			userSession.basicRemote.sendText("${sendThis}")
		}
	}
}
