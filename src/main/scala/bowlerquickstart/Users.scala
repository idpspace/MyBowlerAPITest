package bowlerquickstart

import collection.mutable.MutableList

case class Users(id: Long, var name: String, var yearBirth: java.lang.Integer)

object Users{

  var allUsers = new MutableList[Users]
  allUsers += Users(1, "Allan", 2011)
  allUsers += Users(2, "Bob", 1997)

  def findAll: List[Users] = allUsers.toList

}