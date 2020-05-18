SUMMARY = "NPM: unified-diff"
DESCRIPTION = "unified plugin to ignore unrelated messages"
HOMEPAGE = "https://github.com/unifiedjs/unified-diff#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-git-diff-tree-native \
           npm-vfile-find-up-native"

SRC_URI = "https://registry.npmjs.org/unified-diff/-/unified-diff-3.0.1.tgz"
SRC_URI[md5sum] = "5f2ca89d1d167138751bdff6ba423457"
SRC_URI[sha256sum] = "06b4196a2e462bfcf1a425476ca4ffb8d7be1af06492ed006b3cb945e6bc3936"

NPM_PKGNAME = "unified-diff"

inherit npmhelper
inherit native
