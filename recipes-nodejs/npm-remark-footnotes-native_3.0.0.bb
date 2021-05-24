SUMMARY = "NPM: remark-footnotes"
DESCRIPTION = "remark plugin to add support for pandoc footnotes"
HOMEPAGE = "https://github.com/remarkjs/remark-footnotes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-footnote-native \
           npm-micromark-extension-footnote-native"

SRC_URI = "https://registry.npmjs.org/remark-footnotes/-/remark-footnotes-3.0.0.tgz"
SRC_URI[md5sum] = "ddf3cd59073322f0bb9c97b22057bbf9"
SRC_URI[sha256sum] = "6b4e6afb2538bf4d0c11fa0ff45019a6a8f3752e66248942ef91876d928afeaa"

NPM_PKGNAME = "remark-footnotes"

inherit npmhelper
inherit native
