SUMMARY = "Too less variation - A tool to discover code duplication in various languages"
HOMEPAGE = "https://github.com/priv-kweihmann/tlv"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

DEPENDS += "\
    python3-chardet-native \
    python3-pygments-native \
"

SRC_URI = "git://github.com/priv-kweihmann/tlv.git;protocol=https;branch=master"
SRCREV = "3dc4c0971eaf26d7710a1b3b1bea023381f655f6"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "tlv"
PIP_INSTALL_PACKAGE = "tlv"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-pygments \
"
