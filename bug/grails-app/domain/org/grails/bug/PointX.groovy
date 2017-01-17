package org.grails.bug

class PointX {

    static  belongsTo = [room:Room]

    float x
    float y

    static constraints = {
    }
}
