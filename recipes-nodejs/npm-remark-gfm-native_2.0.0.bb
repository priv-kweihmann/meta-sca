SUMMARY = "NPM: remark-gfm"
DESCRIPTION = "remark plugin to support GFM (autolink literals, strikethrough, tables, tasklists)"
HOMEPAGE = "https://github.com/remarkjs/remark-gfm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-gfm-native \
           npm-micromark-extension-gfm-native \
           npm-types-mdast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark-gfm/-/remark-gfm-2.0.0.tgz"
SRC_URI[md5sum] = "0404c1536ccb8d46cef9d84bdfe06d75"
SRC_URI[sha256sum] = "0473fb3ca9bc92f9829767d7fa1b4f2f987f05a6d29bc83ced06b1f6552cd178"

NPM_PKGNAME = "remark-gfm"

inherit npmhelper
inherit native
