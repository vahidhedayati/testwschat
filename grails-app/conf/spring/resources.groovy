import anythingbut.grails.plugin.wschat.MyOverrideService



// Place your Spring DSL code here
beans = {
	/*
	wsClientProcessService(MyChatClientService){
		grailsApplication = ref('grailsApplication')
		chatClientListenerService = ref('chatClientListenerService')
		wsChatUserService = ref('wsChatUserService')
	}
	*/
	wsClientProcessService(MyOverrideService){
		grailsApplication = ref('grailsApplication')
		chatClientListenerService = ref('chatClientListenerService')
		wsChatUserService = ref('wsChatUserService')
	}
}