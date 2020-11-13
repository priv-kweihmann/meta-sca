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

SRC_URI = "https://registry.npmjs.org/remark-mdx/-/remark-mdx-2.0.0-next.8.tgz"
SRC_URI[md5sum] = "cff26be5799336fa293123d64d793d45"
SRC_URI[sha256sum] = "8453ecf275b2457abe42134772cc5db3a30036923f7a26c479989ea142bf6d90"

NPM_PKGNAME = "remark-mdx"

inherit npmhelper
inherit native
