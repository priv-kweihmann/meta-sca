SUMMARY = "NPM: remark-footnotes"
DESCRIPTION = "remark plugin to add support for pandoc footnotes"
HOMEPAGE = "https://github.com/remarkjs/remark-footnotes#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-footnote-native \
           npm-micromark-extension-footnote-native \
           npm-types-mdast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark-footnotes/-/remark-footnotes-4.0.1.tgz"
SRC_URI[md5sum] = "eec279e3b7cf442fda4369f54d7b307b"
SRC_URI[sha256sum] = "aa10273c82826c3f0d3f1fef0e12c8c4b044f342cd75e8b54fb151bdc90eea31"

NPM_PKGNAME = "remark-footnotes"

inherit npmhelper
inherit native
