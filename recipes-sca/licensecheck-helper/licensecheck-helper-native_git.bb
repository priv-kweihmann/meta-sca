SUMMARY = "License check helper tool"
HOMEPAGE = "https://github.com/priv-kweihmann/licensecheck"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42b280e18423c22b76d77cbbc6f59b47"

DEPENDS += "python3-license-expression-native"

SRC_URI = "git://github.com/priv-kweihmann/licensecheck.git;branch=master;protocol=https"
SRCREV = "14c7c7d1dbfdc720c4c9c1575102379c74f8715d"

S = "${WORKDIR}/git"

UPSTREAM_CHECK_COMMITS = "1"

inherit setuptools3
inherit native
