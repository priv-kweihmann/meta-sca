SUMMARY = "NPM: unified-diff"
DESCRIPTION = "Unified plugin to ignore unrelated messages"
HOMEPAGE = "https://github.com/unifiedjs/unified-diff#readme"

DEPENDS = "npm-git-diff-tree-native npm-vfile-find-up-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/unified-diff/-/unified-diff-1.0.2.tgz"
SRC_URI[md5sum] = "01511462944179d5f5c92684493606c7"
SRC_URI[sha256sum] = "6246112d23d419525177f49c9d2ccd43bc122f911a921637ff4dd7a3b731def1"

NPM_PKGNAME = "unified-diff"

inherit npmhelper
inherit native
