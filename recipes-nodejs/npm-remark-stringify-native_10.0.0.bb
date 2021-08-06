SUMMARY = "NPM: remark-stringify"
DESCRIPTION = "remark plugin to compile markdown"
HOMEPAGE = "https://remark.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=11edd66fd34c2e93c27d1e7a4f248ee3"

DEPENDS = "npm-mdast-util-to-markdown-native \
           npm-types-mdast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark-stringify/-/remark-stringify-10.0.0.tgz"
SRC_URI[md5sum] = "957e9ee27605829e03dcfe74e87875db"
SRC_URI[sha256sum] = "7686cfd7dbc659ccec16b3419f55633d9a7f4c18784061b37296d89353a1a567"

NPM_PKGNAME = "remark-stringify"

inherit npmhelper
inherit native
