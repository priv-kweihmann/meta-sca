SUMMARY = "A Spell Checker for Code!"
DESCRIPTION = "A Spell Checker for Code!"
HOMEPAGE = "https://github.com/Jason3S/cspell"

SRC_URI = "git://github.com/streetsidesoftware/cspell.git;protocol=https;tag=v${PV}"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS += "nodejs-native"
S = "${WORKDIR}/git"

inherit sca

SCA_ENABLED_MODULES = "npmaudit"
