SUMMARY = "NPM: remark-gfm"
DESCRIPTION = "remark plugin to support GFM (autolink literals, footnotes, strikethrough, tables, tasklists)"
HOMEPAGE = "https://github.com/remarkjs/remark-gfm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-gfm-native \
           npm-micromark-extension-gfm-native \
           npm-types-mdast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark-gfm/-/remark-gfm-3.0.0.tgz"
SRC_URI[md5sum] = "b62b266a7f2a25c00d72cf0a0a1174de"
SRC_URI[sha256sum] = "158d8da2e4a448725f981733158cee1dd57c41930393763ff8c2cda76fd6493f"

NPM_PKGNAME = "remark-gfm"

inherit npmhelper
inherit native
