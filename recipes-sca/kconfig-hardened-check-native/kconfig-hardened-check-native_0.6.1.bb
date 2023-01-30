SUMMARY = "script for checking on linux kernel hardening"
HOMEPAGE = "https://github.com/a13xp0p0v/kconfig-hardened-check"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "python3-native"

SRC_URI = "\
    git://github.com/a13xp0p0v/kconfig-hardened-check.git;protocol=https;branch=master \
"
SRCREV = "295a293b0f21b016b1a9ec0eae1f29e52e70cff1"
S = "${WORKDIR}/git"

inherit setuptools3
inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "kconfighard"

FILES:${PN} += "${bindir}"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-json \
"
