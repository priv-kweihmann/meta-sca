SUMMARY = "NPM: moment"
DESCRIPTION = "Parse, validate, manipulate, and display dates"
HOMEPAGE = "https://momentjs.com"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=397bb5fedab22612d8d69f1458a9321e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/moment/-/moment-2.29.3.tgz"
SRC_URI[md5sum] = "00e76141dfbe294c24cec8a73109ba63"
SRC_URI[sha256sum] = "2161b1e4f877c94e947b58052b9369e7c4d9c5200b20c22562573d422fa04ce6"

NPM_PKGNAME = "moment"

inherit npmhelper
inherit native
