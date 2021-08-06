SUMMARY = "NPM: remark"
DESCRIPTION = "Markdown processor powered by plugins part of the unified collective"
HOMEPAGE = "https://remark.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=11edd66fd34c2e93c27d1e7a4f248ee3"

DEPENDS = "npm-remark-parse-native \
           npm-remark-stringify-native \
           npm-types-mdast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark/-/remark-14.0.1.tgz"
SRC_URI[md5sum] = "1d7274cc676089ef84fa3ce90a716eb1"
SRC_URI[sha256sum] = "4ce3edc18e708b5b56f9b6855377b6045100f6467926639b593b66a9592f5e21"

NPM_PKGNAME = "remark"

inherit npmhelper
inherit native
