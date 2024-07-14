SUMMARY = "License check helper tool"
HOMEPAGE = "https://github.com/priv-kweihmann/licensecheck"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42b280e18423c22b76d77cbbc6f59b47"

DEPENDS += "python3-license-expression-native"

SRC_URI = "git://github.com/priv-kweihmann/licensecheck.git;branch=master;protocol=https"
SRCREV = "f5700a9888486ab954510076cbdebdc8721e644e"

UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git"

inherit setuptools3
inherit_defer native
