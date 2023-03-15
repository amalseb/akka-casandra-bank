package com.bank.actors

import akka.actor.typed.ActorRef

class Bank {
//commands = messages
  import PersistentBankAccount.Command

  //events
  sealed trait Event
  case class BankAccountCreated(id:String) extends Event

  //state
  case class State(accounts: Map[String, ActorRef[Command]])

  //command handler
  //event handler
  //  behavior
}
