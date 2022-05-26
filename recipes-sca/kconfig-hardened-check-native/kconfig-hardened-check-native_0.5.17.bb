SUMMARY = "script for checking on linux kernel hardening"
HOMEPAGE = "https://github.com/a13xp0p0v/kconfig-hardened-check"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "python3-native"

SRC_URI = "\
    git://github.com/a13xp0p0v/kconfig-hardened-check.git;protocol=https;branch=master \
    file://0001-setup.cfg-fix-Usage-of-dash-separated-items.patch \
"
SRCREV = "87db8c4fc519a655380aefe635de41e6df1568e3"
S = "${WORKDIR}/git"

inherit setuptools3
inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "kconfighard"

FILES:${PN} += "${bindir}"
