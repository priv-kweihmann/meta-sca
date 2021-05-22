SUMMARY = "NPM: source-map-js"
DESCRIPTION = "Generates and consumes source maps"
HOMEPAGE = "https://github.com/7rulnik/source-map"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/source-map-js/-/source-map-js-0.6.2.tgz"
SRC_URI[md5sum] = "c45ab3b5bfa55e9152b2e0036fc16de2"
SRC_URI[sha256sum] = "1a6d90ce8f0b097794ec37c0ff6674792f1b2f3ec713465472334a1ba25122a1"

NPM_PKGNAME = "source-map-js"

inherit npmhelper
inherit native
