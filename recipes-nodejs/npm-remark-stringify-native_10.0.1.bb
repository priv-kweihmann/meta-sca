SUMMARY = "NPM: remark-stringify"
DESCRIPTION = "remark plugin to compile markdown"
HOMEPAGE = "https://remark.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=11edd66fd34c2e93c27d1e7a4f248ee3"

DEPENDS = "npm-mdast-util-to-markdown-native \
           npm-types-mdast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark-stringify/-/remark-stringify-10.0.1.tgz"
SRC_URI[md5sum] = "a5077e3fbab95d469c7efe210450fc2c"
SRC_URI[sha256sum] = "695cc56b0cd1597088fcadf7b5228079f4f31ea720f18248997567c3e4a11cf6"

NPM_PKGNAME = "remark-stringify"

inherit npmhelper
inherit native
