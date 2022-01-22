SUMMARY = "NPM: source-map-js"
DESCRIPTION = "Generates and consumes source maps"
HOMEPAGE = "https://github.com/7rulnik/source-map-js"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/source-map-js/-/source-map-js-1.0.2.tgz"
SRC_URI[md5sum] = "17f1dd3658eab69a212dd37d9f22d2a8"
SRC_URI[sha256sum] = "ab8c0822f77edbc7aee213a561f5228f0845e9ec10229618c521255f0ed63437"

NPM_PKGNAME = "source-map-js"

inherit npmhelper
inherit native
