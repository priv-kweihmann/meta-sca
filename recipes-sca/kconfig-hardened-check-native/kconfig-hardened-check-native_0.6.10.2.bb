SUMMARY = "script for checking on linux kernel hardening"
HOMEPAGE = "https://github.com/a13xp0p0v/kconfig-hardened-check"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "python3-native"

SRC_URI = "\
    git://github.com/a13xp0p0v/kconfig-hardened-check.git;protocol=https;branch=master \
"
SRCREV = "0ebece346f187e7d3589883cc1d194fcd1c3cda8"

do_compile:prepend() {
    rm -rf ${S}/patches
}

inherit python_setuptools_build_meta
inherit sca-description
inherit_defer native

SCA_TOOL_DESCRIPTION = "kconfighard"

FILES:${PN} += "${bindir}"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-json \
"
