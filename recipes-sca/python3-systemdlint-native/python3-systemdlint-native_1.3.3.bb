SUMMARY = "Systemd Linter"
HOMEPAGE = "https://github.com/priv-kweihmann/systemdlint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

DEPENDS += "\
            python3-anytree-native \
            python3-systemdunitparser-native \
           "

SRC_URI = "git://github.com/priv-kweihmann/systemdlint.git;protocol=https;branch=master"
SRCREV = "85fc985ab96f4d476843f3d8b504dde7d170ed5f"

S = "${UNPACKDIR}/${BPN}-${PV}/systemdlint"

inherit sca-description
inherit setuptools3
inherit_defer native

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
