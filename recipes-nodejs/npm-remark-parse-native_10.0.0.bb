SUMMARY = "NPM: remark-parse"
DESCRIPTION = "remark plugin to parse markdown"
HOMEPAGE = "https://remark.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=11edd66fd34c2e93c27d1e7a4f248ee3"

DEPENDS = "npm-mdast-util-from-markdown-native \
           npm-types-mdast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark-parse/-/remark-parse-10.0.0.tgz"
SRC_URI[md5sum] = "faab76cfe28ac205925c64b24fd398dd"
SRC_URI[sha256sum] = "9385ebcd1f2cbf003b8098d0d335dd5ad35fb8e03c4df50b29845d4d6812da08"

NPM_PKGNAME = "remark-parse"

inherit npmhelper
inherit native
