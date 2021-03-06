// locations to search for config files that get merged into the main config;
// config files can be ConfigSlurper scripts, Java properties files, or classes
// in the classpath in ConfigSlurper format

// grails.config.locations = [ "classpath:${appName}-config.properties",
//                             "classpath:${appName}-config.groovy",
//                             "file:${userHome}/.grails/${appName}-config.properties",
//                             "file:${userHome}/.grails/${appName}-config.groovy"]

// if (System.properties["${appName}.config.location"]) {
//    grails.config.locations << "file:" + System.properties["${appName}.config.location"]
// }

grails.project.groupId = appName // change this to alter the default package name and Maven publishing destination

// The ACCEPT header will not be used for content negotiation for user agents containing the following strings (defaults to the 4 major rendering engines)
grails.mime.disable.accept.header.userAgents = ['Gecko', 'WebKit', 'Presto', 'Trident']
grails.mime.types = [ // the first one is the default format
    all:           '*/*', // 'all' maps to '*' or the first available format in withFormat
    atom:          'application/atom+xml',
    css:           'text/css',
    csv:           'text/csv',
    form:          'application/x-www-form-urlencoded',
    html:          ['text/html','application/xhtml+xml'],
    js:            'text/javascript',
    json:          ['application/json', 'text/json'],
    multipartForm: 'multipart/form-data',
    rss:           'application/rss+xml',
    text:          'text/plain',
    hal:           ['application/hal+json','application/hal+xml'],
    xml:           ['text/xml', 'application/xml']
]

// URL Mapping Cache Max Size, defaults to 5000
//grails.urlmapping.cache.maxsize = 1000

// Legacy setting for codec used to encode data with ${}
grails.views.default.codec = "html"

// The default scope for controllers. May be prototype, session or singleton.
// If unspecified, controllers are prototype scoped.
grails.controllers.defaultScope = 'singleton'

// GSP settings
grails {
    views {
        gsp {
            encoding = 'UTF-8'
            htmlcodec = 'xml' // use xml escaping instead of HTML4 escaping
            codecs {
                expression = 'html' // escapes values inside ${}
                scriptlet = 'html' // escapes output from scriptlets in GSPs
                taglib = 'none' // escapes output from taglibs
                staticparts = 'none' // escapes output from static template parts
            }
        }
        // escapes all not-encoded output at final stage of outputting
        // filteringCodecForContentType.'text/html' = 'html'
    }
}


grails.converters.encoding = "UTF-8"
// scaffolding templates configuration
grails.scaffolding.templates.domainSuffix = 'Instance'

// Set to false to use the new Grails 1.2 JSONBuilder in the render method
grails.json.legacy.builder = false
// enabled native2ascii conversion of i18n properties files
grails.enable.native2ascii = true
// packages to include in Spring bean scanning
grails.spring.bean.packages = []
// whether to disable processing of multi part requests
grails.web.disable.multipart=false

// request parameters to mask when logging exceptions
grails.exceptionresolver.params.exclude = ['password']

// configure auto-caching of queries by default (if false you can cache individual queries with 'cache: true')
grails.hibernate.cache.queries = false

// configure passing transaction's read-only attribute to Hibernate session, queries and criterias
// set "singleSession = false" OSIV mode in hibernate configuration after enabling
grails.hibernate.pass.readonly = false
// configure passing read-only to OSIV session by default, requires "singleSession = false" OSIV mode
grails.hibernate.osiv.readonly = false

environments {
    development {
        grails.logging.jul.usebridge = true
    }
    production {
        grails.logging.jul.usebridge = false
        // TODO: grails.serverURL = "http://www.changeme.com"
    }
}
/*
log4j = {
	appenders {
		console name: 'stdout', layout: pattern(conversionPattern: '%d{yyyy-MM-dd HH:mm:ss,SSS Z} [%t] %-5p %c{1}:%L %x - %m%n')
	}
	
	root {
		info 'stdout'
	}
	
	error stdout: 'org.codehaus.groovy.grails.web.servlet',        // controllers
	'org.codehaus.groovy.grails.web.pages',          // GSP
	'org.codehaus.groovy.grails.web.sitemesh',       // layouts
	'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
	'org.codehaus.groovy.grails.web.mapping',        // URL mapping
	'org.codehaus.groovy.grails.commons',            // core / classloading
	'org.codehaus.groovy.grails.plugins',            // plugins
	'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
	'org.springframework',
	'org.hibernate',
	'net.sf.ehcache.hibernate',
	'grails.plugin.wschat'  //capture wschat errors
	info  stdout:'grails.plugin.wschat.*'
	debug stdout: 'org.grails.plugin.wschat.*',
	'grails.plugin.wschat.*',
	' grails.plugin.wschat.auth.WsChatAuthService'
}
*/
/*
// log4j configuration
log4j.main = {
    // Example of changing the log pattern for the default console appender:
    //
    //appenders {
    //    console name:'stdout', layout:pattern(conversionPattern: '%c{2} %m%n')
    //}
	
	appenders {
		console name:'stdout', layout:pattern(conversionPattern: '%c{2} %m%n')
	}
	
	root {
		error 'stdout'
		additivity = true
	}
	
	
	info  'grails.plugin.wschat'
	error 'grails.plugin.wschat'  //capture wschat errors
	debug 'grails.plugin.wschat'
    error  'org.codehaus.groovy.grails.web.servlet',        // controllers
           'org.codehaus.groovy.grails.web.pages',          // GSP
           'org.codehaus.groovy.grails.web.sitemesh',       // layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping',        // URL mapping
           'org.codehaus.groovy.grails.commons',            // core / classloading
           'org.codehaus.groovy.grails.plugins',            // plugins
           'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate',
		   'grails.plugin.wschat'  //capture wschat errors
	all  'grails.plugin.wschat'
	
	debug stdout: ['grails.plugin.wschat']
		   
}
*/


log4j = {
		error   'org.codehaus.groovy.grails.web.servlet',        // controllers
				'org.codehaus.groovy.grails.web.pages',          // GSP
				'org.codehaus.groovy.grails.web.sitemesh',       // layouts
				'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
				'org.codehaus.groovy.grails.web.mapping',        // URL mapping
				'org.codehaus.groovy.grails.commons',            // core / classloading
				'org.codehaus.groovy.grails.plugins',            // plugins
				'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
				'org.springframework',
				'org.hibernate',
				'net.sf.ehcache.hibernate',
				'grails.plugin.wschat'
				
		info    'grails',
				'grails.app.task',  // this is for quartz jobs
				'grails.app.service',
				'grails.app.controller',
				'grails.plugin.wschat'
		debug 'grails.plugin.wschat'
		warn 'grails.plugin.wschat'
				

}



wschat.defaultperm='admin'
wschat.rooms = ['fred','smith','room3']
wschat.showtitle='no'
//wschat.hostname='localhost:8080'

//wschat.hostname='192.168.1.196:8080'
stunServers { iceServers=[ [url: 'stun:stun.l.google.com:19302'] ] }
wschat.send.leftroom='yes'
wschat.send.joinroom='yes'
wschat.frontenduser='_frontend'
wschat.storeForFrontEnd=true
wschat.dbstore=true
wschat.dbstore_pm_messages=true
wschat.dbstore_room_messages=true
wschat.debug=true

//wschat.dbstore_user_messages=true
wschat.addFile='false'
wschat.addGame='false'

wschat.liveChatAssistant='assistant' // the chat client assistant name.. so if userx requests chat .. userx_assistant = this what this is . 
wschat.liveChatPerm='liveChat'  // this is the group of users that livechat belongs to and if those uses have an email address in profile they will also be emailed
wschat.liveContactEmail='user@gmail.com' // this is the hard coded live chat email 
wschat.liveChatUsername='masterv'  // this is the nickname upon them joining a live request
wschat.liveContactName='Mr V'  // this is the person that email title is set to
wschat.emailFrom="user@gmail.com"  //this is for sending emails
wschat.store_live_messages=true  // store records of offline messaging
wschat.enable_AI=true  // enable Aritificial Intelligence ? refer to ChatAI.groovy for example and understanding
wschat.liveChatTitle="My Live chat"
wschat.liveChatAskName='true'
wschat.liveChatAskEmail='true'
wschat.enable_Chat_Bot='false'
wschat.enable_Chat_AI=true
wschat.enable_Chat_BadWords=true
wschat.enableSecurity='false'
// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'grails.plugin.wschat.ChatAuth'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'grails.plugin.wschat.ChatAuthChatRole'
grails.plugin.springsecurity.authority.className = 'grails.plugin.wschat.ChatRole'
grails.plugin.springsecurity.securityConfigType = "Annotation"
//grails.plugin.springsecurity.securityConfigType = 'InterceptUrlMap'
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/wschat'
grails.plugin.springsecurity.successHandler.alwaysUseDefault = true
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
        '/error':           ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/index':           ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/index.gsp':       ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/shutdown':        ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/assets/**':       ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/**/js/**':        ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/**/css/**':       ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/**/images/**':    ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/**/favicon.ico':  ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/wsChat/**':       ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/wsChatAdmin/**':       ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/wsCamEndpoint/**':        ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/wsChatEndpoint/**':       ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/wsChatFileEndpoint/**':   ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/TicTacToeServer/**':      ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/wsCamEndpoint':       ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/wsChatEndpoint':      ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/wsChatFileEndpoint':  ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/TicTacToeServer':     ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/dbconsole/**':       ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/test/**':       ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/ChatClientEndpoint/**':   ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/WsChatClientEndpoint/**': ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/ChatClientEndpoint':  ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/WsChatClientEndpoint':    ['IS_AUTHENTICATED_ANONYMOUSLY'],
        '/**':        ['IS_AUTHENTICATED_ANONYMOUSLY']
]

wschat.hostname='localhost:8080'
wschat.wsProtocol='ws'
wschat.siteProtocol='http'
