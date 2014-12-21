import grails.plugin.wschat.ChatPermissions
import grails.plugin.wschat.ChatUser


class BootStrap {

    def init = { servletContext ->
		
		def perm=ChatPermissions.findOrSaveWhere(name: 'admin').save(flush:true)
		ChatUser.findOrSaveWhere(username:'firefox', permissions:perm).save(flush:true)
		ChatUser.findOrSaveWhere(username:'chrome', permissions:perm).save(flush:true)
    }
    def destroy = {
    }
}
