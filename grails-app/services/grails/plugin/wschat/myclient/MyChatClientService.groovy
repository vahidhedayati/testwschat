package grails.plugin.wschat.myclient

import grails.gsp.PageRenderer
import grails.plugin.wschat.client.WsChatClientService
import grails.plugin.wschat.client.WsChatClientTagLib

import javax.websocket.Session

import org.springframework.web.context.request.RequestContextHolder



public  class MyChatClientService extends WsChatClientService {
//def wsChatClientTagLib
//def grailsApplication
	PageRenderer groovyPageRenderer
	WsChatClientTagLib wsChatClientTagLib=new WsChatClientTagLib()
	@Override
	public void processAct(Session userSession, boolean pm,String actionthis, String sendThis,
		String divId, String msgFrom, boolean strictMode) {
		if (pm) {
			if (strictMode==false) {
				userSession.basicRemote.sendText("[PROCESS]"+sendThis)
			}
			userSession.basicRemote.sendText("/pm ${msgFrom},${sendThis}")
		}else{
			userSession.basicRemote.sendText("${sendThis}")
		}
	}
}
