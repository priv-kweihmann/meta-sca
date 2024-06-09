SUMMARY = "Systemd Linter"
HOMEPAGE = "https://github.com/priv-kweihmann/systemdlint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
UNPACKDIR ??= "${WORKDIR}/sources-unpack"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/git/LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

DEPENDS += "\
    nativesdk-python3-anytree \
    nativesdk-python3-systemdunitparser \
"

SRC_URI = "git://github.com/priv-kweihmann/systemdlint.git;protocol=https;branch=master"
SRCREV = "826e29413aa86ef5b5f9ffe580116cab7ac7fc7a"
UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git/systemdlint"

inherit sca-description
inherit setuptools3
inherit_defer nativesdk
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
