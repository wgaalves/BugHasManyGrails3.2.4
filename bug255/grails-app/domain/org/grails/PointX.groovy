package org.grails

class PointX {

    static  belongsTo = [room:Room]

    float x
    float y

    static constraints = {
    }
}
