#!/usr/bin/env python

import sys
import CosNaming
from omniORB import CORBA, any
from fr.upem.robot import *

nsref = open(sys.argv[1], 'r')
ior = "NameService=" + nsref.read()
orb = CORBA.ORB_init(["-ORBInitRef", ior], CORBA.ORB_ID)

ref = orb.resolve_initial_references("NameService");
namingContext = ref._narrow(CosNaming.NamingContext)

nameRobotPilote = namingContext.to_name("RobotContext/RobotPilote")
nameRobotControl = namingContext.to_name("RobotContext/RobotControl")

objRobotPilote = namingContext.resolve(nameRobotPilote)
objRobotControl = namingContext.resolve(nameRobotControl)

robotPilote = objRobotPilote._narrow(namingContext.resolve(nameRobotPilote))
robotControl = objRobotControl._narrow(namingContext.resolve(nameRobotControl))

if robotPilote is None:
	print "Object reference is not an Example::Echo"
	sys.exit(1)
if robotControl is None:
	print "Object reference is not an Example::Echo"
	sys.exit(1)

try:
	robotPilote.start()
except:
	print "Le robot a deja demarre"

pos = Position(3, 1)
try:
	robotPilote.move(pos)
except:
	print "Mouvement non valide"
try:
	result = robotPilote.stop()
	print result.posX
	print result.posY
except:
	print "Le robot est deja a l'arret"
	
try:
	robotPilote.start()
except:
	print "Le robot a deja demarre"
	
pos = Position(8,5)
try:
	robotPilote.move(pos)
except:
	print "Mouvement non valide"

try:
	result = robotPilote.stop()
	print result.posX
	print result.posY
except:
	print "Le robot est deja a l'arret"

sensor = SensorB("Sensor B1")
anySensor = any.to_any(sensor)
robotControl.setSensor(sensor.name, anySensor)
a = robotControl.getSensor(sensor.name)
typecode = a.typecode()
v = a.value(typecode)
if v is not None:
    print v.name
else:
    print "The Any does not contain a value compatible with " + typecode