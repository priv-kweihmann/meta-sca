SUMMARY = "NPM: moment"
DESCRIPTION = "Parse, validate, manipulate, and display dates"
HOMEPAGE = "https://momentjs.com"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=397bb5fedab22612d8d69f1458a9321e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/moment/-/moment-2.29.2.tgz"
SRC_URI[md5sum] = "abbc46255efb059e42601935e03c7137"
SRC_URI[sha256sum] = "392a7ace289a7b1aa8571184c7a70cf1d2b3b2418c560c1ca94ded8adcc5647e"

NPM_PKGNAME = "moment"

inherit npmhelper
inherit native
