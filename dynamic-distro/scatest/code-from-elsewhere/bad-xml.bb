SUMMARY = "Bad xml testcode"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://1.xml file://2.xml;subdir=source"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/source"
B = "${UNPACKDIR}/source"

SCA_SCORE_SECURITY_ERROR = "0"
SCA_SCORE_FUNCTIONAL_ERROR = "0"
SCA_SCORE_STYLE_ERROR = "0"
inherit sca
