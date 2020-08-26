SUMMARY = "NPM: remark-mdx"
DESCRIPTION = "remark plugin to add support for mdx"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-parse-entities-native \
           npm-remark-stringify-native \
           npm-stringify-entities-native \
           npm-strip-indent-native \
           npm-unist-util-stringify-position-native"

SRC_URI = "https://registry.npmjs.org/remark-mdx/-/remark-mdx-2.0.0-next.7.tgz"
SRC_URI[md5sum] = "97f7bc830d685bf319ad97ac84ab63a2"
SRC_URI[sha256sum] = "a15a2696c3f3bd2107aec4f46188fb6ad7fafbf2371bd22d84369633447ee1ec"

NPM_PKGNAME = "remark-mdx"

inherit npmhelper
inherit native
