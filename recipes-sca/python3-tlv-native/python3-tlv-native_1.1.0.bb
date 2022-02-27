SUMMARY = "Too less variation - A tool to discover code duplication in various languages"
HOMEPAGE = "https://github.com/priv-kweihmann/tlv"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

DEPENDS += "\
    python3-chardet-native \
    python3-pygments-native \
"

SRC_URI = "git://github.com/priv-kweihmann/tlv.git;protocol=https;branch=master"
SRCREV = "de68986f7306061031e117efb93ee044425e554f"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "tlv"
PIP_INSTALL_PACKAGE = "tlv"
