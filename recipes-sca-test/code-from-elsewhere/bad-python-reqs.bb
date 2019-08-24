LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

SRC_URI = "file://requirements.txt;subdir=source \
           file://setup.py;subdir=source \
           "

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

inherit sca