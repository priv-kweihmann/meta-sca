SUMMARY = "License check helper tool"
HOMEPAGE = "https://github.com/priv-kweihmann/licensecheck"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42b280e18423c22b76d77cbbc6f59b47"

DEPENDS += "python3-license-expression-native"

SRC_URI = "git://github.com/priv-kweihmann/licensecheck.git;branch=master;protocol=https"
SRCREV = "a24e2e589665da87a944e2f5061b27f82a5206ad"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native
