SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-chalk-native \
           npm-source-map-native \
           npm-supports-color-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-7.0.31.tgz"
SRC_URI[md5sum] = "f8d0937fcdcaad0223aa1b8d56741f00"
SRC_URI[sha256sum] = "43f42cce767be8a9540a419e7ee5f598a6514550120a78bff897820808520a2d"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
