SUMMARY = "NPM: unified-diff"
DESCRIPTION = "unified plugin to ignore unrelated messages"
HOMEPAGE = "https://github.com/unifiedjs/unified-diff#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-git-diff-tree-native \
           npm-vfile-find-up-native"

SRC_URI = "https://registry.npmjs.org/unified-diff/-/unified-diff-3.1.0.tgz"
SRC_URI[md5sum] = "9f4873ac33e9e0f817702ff71a88b99f"
SRC_URI[sha256sum] = "65c3cff685610047b41d23618b13d8935fed07e340f8cbe26c248fec17e8daa4"

NPM_PKGNAME = "unified-diff"

inherit npmhelper
inherit native
