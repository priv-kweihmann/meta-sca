SUMMARY = "NPM: moment"
DESCRIPTION = "Parse, validate, manipulate, and display dates"
HOMEPAGE = "https://momentjs.com"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=397bb5fedab22612d8d69f1458a9321e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/moment/-/moment-2.29.1.tgz"
SRC_URI[md5sum] = "80dd0d62b6cdeeef5bdf4a10e1e204ae"
SRC_URI[sha256sum] = "42180f9a64027e9846d9aefc5fc65c9863985b3cbab41a56edde3892480c2c55"

NPM_PKGNAME = "moment"

inherit npmhelper
inherit native
