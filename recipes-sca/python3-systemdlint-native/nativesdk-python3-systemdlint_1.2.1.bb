SUMMARY = "Systemd Linter"
HOMEPAGE = "https://github.com/priv-kweihmann/systemdlint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

DEPENDS += "\
    nativesdk-python3-anytree \
    nativesdk-python3-systemdunitparser \
"

SRC_URI = "git://github.com/priv-kweihmann/systemdlint.git;protocol=https;branch=master"
SRCREV = "d9909d2e2d970599bb2015e2a667d4debf063384"
S = "${WORKDIR}/git/systemdlint"

inherit sca-description
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "systemdlint"
PIP_INSTALL_PACKAGE = "systemdlint"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-anytree \
    nativesdk-python3-core \
    nativesdk-python3-datetime \
    nativesdk-python3-io \
    nativesdk-python3-shell \
    nativesdk-python3-systemdunitparser \
"
