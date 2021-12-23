SUMMARY = "Bad spelling testcode"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://bad.txt;subdir=source"

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

SCA_SCORE_SECURITY_ERROR = "0"
SCA_SCORE_FUNCTIONAL_ERROR = "0"
SCA_SCORE_STYLE_ERROR = "0"
inherit sca

SCA_SEVERITY_TRANSFORM_EXTRA += "cspell.*=warning"

SCA_ENABLED_MODULES = "bitbake cspell"
