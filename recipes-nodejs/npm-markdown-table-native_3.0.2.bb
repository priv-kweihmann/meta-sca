SUMMARY = "NPM: markdown-table"
DESCRIPTION = "Generate a markdown (GFM) table"
HOMEPAGE = "https://github.com/wooorm/markdown-table#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/markdown-table/-/markdown-table-3.0.2.tgz"
SRC_URI[md5sum] = "f3fd4f2a2cb3f294e888d868295c3917"
SRC_URI[sha256sum] = "d0c1f02c0fc5d54ac824d99b205c0a556ec016eccf857a89ab91cd764a640ff4"

NPM_PKGNAME = "markdown-table"

inherit npmhelper
inherit native
