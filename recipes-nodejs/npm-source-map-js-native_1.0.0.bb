SUMMARY = "NPM: source-map-js"
DESCRIPTION = "Generates and consumes source maps"
HOMEPAGE = "https://github.com/7rulnik/source-map"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/source-map-js/-/source-map-js-1.0.0.tgz"
SRC_URI[md5sum] = "d8b0338a9fdcb2af459b394eed732268"
SRC_URI[sha256sum] = "3ce500a333be2e71bd192d21e567461a0787eab2d3769ded9ec5731859d69e60"

NPM_PKGNAME = "source-map-js"

inherit npmhelper
inherit native
