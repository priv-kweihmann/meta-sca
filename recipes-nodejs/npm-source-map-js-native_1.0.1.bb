SUMMARY = "NPM: source-map-js"
DESCRIPTION = "Generates and consumes source maps"
HOMEPAGE = "https://github.com/7rulnik/source-map"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/source-map-js/-/source-map-js-1.0.1.tgz"
SRC_URI[md5sum] = "223bb646d918a73b6a2d2eecc8cbc0f4"
SRC_URI[sha256sum] = "92ec3ae5ec9b2ec6d4870690bd0ff1b805700bb121fc243e562a9559853efbce"

NPM_PKGNAME = "source-map-js"

inherit npmhelper
inherit native
