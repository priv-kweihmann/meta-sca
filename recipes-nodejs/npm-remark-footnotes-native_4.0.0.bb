SUMMARY = "NPM: remark-footnotes"
DESCRIPTION = "remark plugin to add support for pandoc footnotes"
HOMEPAGE = "https://github.com/remarkjs/remark-footnotes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-footnote-native \
           npm-micromark-extension-footnote-native \
           npm-types-mdast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark-footnotes/-/remark-footnotes-4.0.0.tgz"
SRC_URI[md5sum] = "e12e0d1e6cab7b341d1b5066d56f3051"
SRC_URI[sha256sum] = "b9dd61b60675e1b8be09f912dca4b914125f9771546dbaf36908979048b87c0d"

NPM_PKGNAME = "remark-footnotes"

inherit npmhelper
inherit native
