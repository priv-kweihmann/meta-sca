SUMMARY = "script for checking on linux kernel hardening"
HOMEPAGE = "https://github.com/a13xp0p0v/kconfig-hardened-check"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "python3-native"

SRC_URI = "\
    git://github.com/a13xp0p0v/kconfig-hardened-check.git;protocol=https;branch=master \
    file://0001-pyproject.toml-add-file.patch \
"
SRCREV = "c226caea59131f89b4118029362afdf3e3cee903"
UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git"

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
