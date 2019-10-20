#!/bin/sh
timeout --foreground --kill-after=${MAX_RUNTIME_KILL}m ${MAX_RUNTIME}m bitbake -q ${SCA_TARGET_IMG}
if [ $? = 124 ]; then 
    echo "Timeout"
    return 0
else 
    return 1
fi;