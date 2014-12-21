package grails.plugin.wschat.myclient

import grails.plugin.wschat.client.WsChatClientService

import javax.websocket.Session



public  class MyChatClientService extends WsChatClientService {
	//PageRenderer groovyPageRenderer
	@Override
	public void processAct(Session userSession, boolean pm,String actionthis, String sendThis,
		String divId, String msgFrom, boolean strictMode, boolean masterNode) {
		String addon="[PROCESS]"
		if (masterNode) {
			addon="[PROCESSED]"
		}
		if (masterNode) {
			if (actionthis== 'do_task_1') {
				// TODO something on master node that has mappings to do_task_1
				println "something on master node that has mappings to do_task_1 TASK1"
			}else if (actionthis== 'do_task_2') {
				// TODO something on master node that has mappings to do_task_2
				println "something on master node that has mappings to do_task_2 TASK2"
			}else if (actionthis== 'do_task_3') {
				// TODO something on master node that has mappings to do_task_3
				println "something on master node that has mappings to do_task_3 TASK3"
			}
			
		}
		if (pm) {
			//if (strictMode==false) {
				userSession.basicRemote.sendText("${addon}"+sendThis)
			//}
			userSession.basicRemote.sendText("/pm ${msgFrom},${sendThis}")
		}else{
			userSession.basicRemote.sendText("${addon}${sendThis}")
			userSession.basicRemote.sendText("${sendThis}")
		}
		def g = new grails.plugin.wschat.client.WsChatClientTagLib()
		//g.updateView(message: sendThis, divId:divId)
		
		def model=[message:sendThis, divId:divId]
		//wsChatClientTagLib.updateView(message: sendThis)
		//def g = grailsApplication.mainContext.getBean('grails.plugin.wschat.client.WsChatClientTagLib')
		//wsChatClientTagLib.updateView(message: sendThis, divId:divId)
		/*
		String html =sendThis
		//groovyPageRenderer.render(template: '/wsChat/clientUpdate', model:model)
		def response = RequestContextHolder.currentRequestAttributes().response
		response.setStatus(200)
		response.setContentType('text/html')
		response.writer.write(html)
		*/
	}
}
