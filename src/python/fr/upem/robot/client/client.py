import sys

from omniORB import CORBA
import fr


orb = CORBA.ORB_init(sys.argv, CORBA.ORB_ID)
ior = sys.argv[1]
obj = orb.string_to_object(ior)

eo = obj._narrow(fr.upem.robot.RobotPilote)

if eo is None:
	print "Object reference is not an Example::Echo"
	sys.exit(1)


#try:
#	eo.start()
#except:
#	print "Le robot a deja demarre"
	
pos = fr.upem.robot.Position(3,2)
try:
	eo.move(pos)
except:
	print "Mouvement non valide"

try:
	result = eo.stop()
	print result.posX
	print result.posY
except:
	print "Le robot est deja a l'arret"
	
try:
	eo.start()
except:
	print "Le robot a deja demarre"
	
pos = fr.upem.robot.Position(8,5)
try:
	eo.move(pos)
except:
	print "Mouvement non valide"

try:
	result = eo.stop()
	print result.posX
	print result.posY
except:
	print "Le robot est deja a l'arret"