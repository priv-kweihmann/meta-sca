SUMMARY = "script for checking on linux kernel hardening"
HOMEPAGE = "https://github.com/a13xp0p0v/kconfig-hardened-check"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "nativesdk-python3"

SRC_URI = "\
    git://github.com/a13xp0p0v/kconfig-hardened-check.git;protocol=https;branch=master \
"
SRCREV = "f4dbe258ff3d37489962ea9cf210192ae7ff9280"
UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git"

inherit setuptools3

inherit sca-description
inherit_defer nativesdk
SCA_TOOL_DESCRIPTION = "kconfighard"
FILES:${PN} += "${bindir}"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-json \
"
