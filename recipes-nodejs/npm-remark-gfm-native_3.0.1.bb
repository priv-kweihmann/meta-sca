SUMMARY = "NPM: remark-gfm"
DESCRIPTION = "remark plugin to support GFM (autolink literals, footnotes, strikethrough, tables, tasklists)"
HOMEPAGE = "https://github.com/remarkjs/remark-gfm#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-gfm-native \
           npm-micromark-extension-gfm-native \
           npm-types-mdast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark-gfm/-/remark-gfm-3.0.1.tgz"
SRC_URI[md5sum] = "b9b039e136f8ef273646a979f5c8edfd"
SRC_URI[sha256sum] = "ed8f3a40d79558949b1aa99490883ed54278e107cd30ec66b05df6fa93358540"

NPM_PKGNAME = "remark-gfm"

inherit npmhelper
inherit native
