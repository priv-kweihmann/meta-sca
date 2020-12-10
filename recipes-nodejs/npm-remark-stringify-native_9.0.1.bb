SUMMARY = "NPM: remark-stringify"
DESCRIPTION = "remark plugin to compile Markdown"
HOMEPAGE = "https://remark.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=11edd66fd34c2e93c27d1e7a4f248ee3"

DEPENDS = "npm-mdast-util-to-markdown-native"

SRC_URI = "https://registry.npmjs.org/remark-stringify/-/remark-stringify-9.0.1.tgz"
SRC_URI[md5sum] = "084b9221b57a3377939ddbf1bc97874f"
SRC_URI[sha256sum] = "b3596f45bede5fd6c249fa3f1b19b31909d673f17910aaeb2db5c665ad23d668"

NPM_PKGNAME = "remark-stringify"

inherit npmhelper
inherit native
