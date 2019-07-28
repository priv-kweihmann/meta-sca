LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

SRC_URI = "file://requirements.txt;subdir=source \
           file://setup.py;subdir=source \
           "

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

inherit sca