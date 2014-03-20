#!/usr/bin/env python

import sys

import fr, fr__POA

class RobotPilote_i (fr__POA.upem.robot.RobotPilote):
	
	def __init__(self):
		self.isStarted = False
		self.robotPosition = fr.upem.robot.Position(0, 0)
	
	def start(self):
		if self.isStarted == True:
			raise fr.upem.robot.AlreadyStarted("Le robot est deja en route.")
		self.isStarted = True
		
	def stop(self):
		self.isStarted = False
		return self.robotPosition
		
	def move(self, pos):
		self.robotPosition.posX = pos.posX
		self.robotPosition.posY = pos.posY