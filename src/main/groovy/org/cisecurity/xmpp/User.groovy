package org.cisecurity.xmpp

import groovy.beans.Bindable

@Bindable
class User {
	String username
	String password
	String domain
	String resource
}
