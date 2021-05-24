SUMMARY = "NPM: markdown-table"
DESCRIPTION = "Markdown tables"
HOMEPAGE = "https://github.com/wooorm/markdown-table#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

DEPENDS = "npm-repeat-string-native"

SRC_URI = "https://registry.npmjs.org/markdown-table/-/markdown-table-2.0.0.tgz"
SRC_URI[md5sum] = "1d61917596def9f0809ba73d709eb588"
SRC_URI[sha256sum] = "8518dca510e2573a2cfcd99f19622e73ea11230dcef0cdb5f6b8344b69665d2d"

NPM_PKGNAME = "markdown-table"

inherit npmhelper
inherit native
