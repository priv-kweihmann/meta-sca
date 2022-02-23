SUMMARY = "Gettext file checker"
HOMEPAGE = "https://github.com/flashcode/msgcheck"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c678957b0c8e964aa6c70fd77641a71e"

DEPENDS += "python3-pyenchant-native"

SRC_URI = "git://github.com/flashcode/msgcheck.git;branch=master;protocol=https"
SRCREV = "ab02cd50d262ef4cb94736ead1844255e1d082e6"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "msgcheck"
