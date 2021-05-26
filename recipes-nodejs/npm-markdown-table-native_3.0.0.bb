SUMMARY = "NPM: markdown-table"
DESCRIPTION = "Markdown tables"
HOMEPAGE = "https://github.com/wooorm/markdown-table#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

DEPENDS = "npm-repeat-string-native \
           npm-types-repeat-string-native"

SRC_URI = "https://registry.npmjs.org/markdown-table/-/markdown-table-3.0.0.tgz"
SRC_URI[md5sum] = "324860392406cdd56f5d8ed613d1ee42"
SRC_URI[sha256sum] = "989973ad6fb04549cac431600f0a240e9e9908a119646ec209a52c7f2b9ae4ff"

NPM_PKGNAME = "markdown-table"

inherit npmhelper
inherit native
