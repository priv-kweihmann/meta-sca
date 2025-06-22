SUMMARY = "Too less variation - A tool to discover code duplication in various languages"
HOMEPAGE = "https://github.com/priv-kweihmann/tlv"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

DEPENDS += "\
    python3-native \
    python3-chardet-native \
    python3-pygments-native \
"

do_fetch[depends] += "python3-native:do_populate_sysroot"

SRC_URI = "git://github.com/priv-kweihmann/tlv.git;protocol=https;branch=master"
SRCREV = "771fc53dc3d1e5ce815700ce5ba54a957ce96318"

inherit sca-description
inherit setuptools3
inherit_defer native

SCA_TOOL_DESCRIPTION = "tlv"
PIP_INSTALL_PACKAGE = "tlv"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-pygments \
"
