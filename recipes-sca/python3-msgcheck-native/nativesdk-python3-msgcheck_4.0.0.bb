SUMMARY = "Gettext file checker"
HOMEPAGE = "https://github.com/flashcode/msgcheck"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c678957b0c8e964aa6c70fd77641a71e"

DEPENDS += "nativesdk-python3-pyenchant"

SRC_URI = "git://github.com/flashcode/msgcheck.git;branch=master;protocol=https"
SRCREV = "ab02cd50d262ef4cb94736ead1844255e1d082e6"
UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git"

inherit sca-description
inherit setuptools3
inherit_defer nativesdk
SCA_TOOL_DESCRIPTION = "msgcheck"
PIP_INSTALL_PACKAGE = "msgcheck"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-io \
    nativesdk-python3-pyenchant \
    nativesdk-python3-shell \
"
