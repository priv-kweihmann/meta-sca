SUMMARY = "NPM: aria-query"
DESCRIPTION = "Programmatic access to the ARIA specification"
HOMEPAGE = "https://github.com/A11yance/aria-query#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cadce3caaeb4d7ea5e8c0e57d5f3d1e7"

DEPENDS = "npm-babel-runtime-corejs3-native \
           npm-babel-runtime-native"

SRC_URI = "https://registry.npmjs.org/aria-query/-/aria-query-4.0.2.tgz"
SRC_URI[md5sum] = "5405d80953e3a21827ae357d1198c4f3"
SRC_URI[sha256sum] = "dcecef584cc1008b33f88d44b58a1031b4645e64d1971b8217810a5ba66c8a0c"

NPM_PKGNAME = "aria-query"

inherit npmhelper
inherit native
