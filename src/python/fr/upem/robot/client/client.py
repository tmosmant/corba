import sys

from omniORB import CORBA, any
from fr.upem.robot import *

orb = CORBA.ORB_init(sys.argv, CORBA.ORB_ID)

iorRobotPilote = sys.argv[1]
iorRobotControl = sys.argv[2]

refRobotPilote = orb.string_to_object(iorRobotPilote)
refRobotControl = orb.string_to_object(iorRobotControl)

robotPilote = refRobotPilote._narrow(RobotPilote)
robotControl = refRobotControl._narrow(RobotControl)

if robotPilote is None:
    print "Object reference is not an Example::Echo"
    sys.exit(1)

if robotControl is None:
    print "Object reference is not an Example::Echo"
    sys.exit(1)

#try:
#	eo.start()
#except:
#	print "Le robot a deja demarre"

pos = Position(3,2)
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
#robotControl.setSensor(sensor.name, anySensor)
a = robotControl.getSensor(sensor.name)
typecode = a.typecode()
v = a.value(typecode)
if v is not None:
    print v.name
else:
    print "The Any does not contain a value compatible with " + typecode