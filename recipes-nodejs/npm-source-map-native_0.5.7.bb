SUMMARY = "NPM: source-map"
DESCRIPTION = "Generates and consumes source maps"
HOMEPAGE = "https://github.com/mozilla/source-map"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44"

SRC_URI = "https://registry.npmjs.org/source-map/-/source-map-0.5.7.tgz"
SRC_URI[md5sum] = "3773f963d18f1aca320fae40b04aded2"
SRC_URI[sha256sum] = "e1de289bc493154f00a11cb4e363e0bb37619537d44b36b8112bba4924116b67"

NPM_PKGNAME = "source-map"

inherit npmhelper
inherit native
