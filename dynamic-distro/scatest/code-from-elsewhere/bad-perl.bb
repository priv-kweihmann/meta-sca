SUMMARY = "Bad perl testcode"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "\
            file://broken.pl;subdir=source \
            file://finger.pl;subdir=source \
            file://mailto.pl;subdir=source \
          "

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

inherit sca
