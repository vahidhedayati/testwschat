import anythingbut.grails.plugin.wschat.MyOverrideService



// Place your Spring DSL code here
beans = {
	wsClientProcessService(MyOverrideService){
		grailsApplication = ref('grailsApplication')
		chatClientListenerService = ref('chatClientListenerService')
		wsChatUserService = ref('wsChatUserService')
	}
}