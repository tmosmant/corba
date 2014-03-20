#!/usr/bin/env python

import sys

from omniORB import CORBA, PortableServer
import fr, fr__POA
import servant 


orb = CORBA.ORB_init(sys.argv, CORBA.ORB_ID)
poa = orb.resolve_initial_references("RootPOA")

ei = servant.RobotPilote_i()
eo = ei._this()

print orb.object_to_string(eo)

poaManager = poa._get_the_POAManager()
poaManager.activate()

orb.run()