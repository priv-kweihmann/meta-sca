SUMMARY = "NPM: nth-check"
DESCRIPTION = "Parses and compiles CSS nth-checks to highly optimized functions."
HOMEPAGE = "https://github.com/fb55/nth-check"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-boolbase-native"

SRC_URI = "https://registry.npmjs.org/nth-check/-/nth-check-2.0.1.tgz"
SRC_URI[md5sum] = "9ab0f0e4407cf232d1b208c8e69859e3"
SRC_URI[sha256sum] = "8d4bd8d735c028c97fbecb6ef687e9775bd799be0e09670deba03808f95d8b8b"

NPM_PKGNAME = "nth-check"

inherit npmhelper
inherit native
