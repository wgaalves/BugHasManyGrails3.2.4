package org.grails

class Room {

    static hasMany = [pointx:PointX,pointy:PointY]

    String name
    static constraints = {
    }
}
