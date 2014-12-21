package grails.plugin.wschat.myclient

import grails.plugin.wschat.client.WsChatClientService
import grails.plugin.wschat.client.WsChatClientTagLib

import javax.websocket.Session



class MyChatClientService extends WsChatClientService {
	def grailsApplication
	//WsChatClientTagLib wsChatClientTagLib=new WsChatClientTagLib()
	def wsChatClientTagLib
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
		//def g = new grails.plugin.wschat.client.WsChatClientTagLib()
		//WsChatClientTagLib
		//def g = grailsApplication.mainContext.getBean('grails.plugin.wschat.client.WsChatClientTagLib')
		wsChatClientTagLib.updateView(message: sendThis, divId:divId, template:'_')
		//g.updateView(message: sendThis)
	}
}
