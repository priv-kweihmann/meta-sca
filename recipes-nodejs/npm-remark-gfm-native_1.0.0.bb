SUMMARY = "NPM: remark-gfm"
DESCRIPTION = "remark plugin to support GFM (autolink literals, strikethrough, tables, tasklists)"
HOMEPAGE = "https://github.com/remarkjs/remark-gfm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-gfm-native \
           npm-micromark-extension-gfm-native"

SRC_URI = "https://registry.npmjs.org/remark-gfm/-/remark-gfm-1.0.0.tgz"
SRC_URI[md5sum] = "202a468f73a9736277f0d45a2425b8b7"
SRC_URI[sha256sum] = "c96bdeb93af60ee840416036490bc977d334707feed5259d698ac0064b83f39c"

NPM_PKGNAME = "remark-gfm"

inherit npmhelper
inherit native
