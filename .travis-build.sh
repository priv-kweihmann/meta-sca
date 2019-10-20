#!/bin/sh
timeout --foreground ${MAX_RUNTIME}m bitbake -q ${SCA_TARGET_IMG} || if [ $? == 124 ]; then echo "Timeout"; else return 1; fi;