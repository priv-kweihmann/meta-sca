SUMMARY = "License check helper tool"
HOMEPAGE = "https://github.com/priv-kweihmann/licensecheck"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42b280e18423c22b76d77cbbc6f59b47"

DEPENDS += "python3-license-expression-native"

SRC_URI = "git://github.com/priv-kweihmann/licensecheck.git;branch=master;protocol=https"
SRCREV = "009432bff5eea58b09f5576c95db93b186f54867"

inherit python_setuptools_build_meta
inherit_defer native
