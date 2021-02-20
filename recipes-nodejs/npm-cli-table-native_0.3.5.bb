SUMMARY = "NPM: cli-table"
DESCRIPTION = "Pretty unicode tables for the CLI"
HOMEPAGE = "https://github.com/Automattic/cli-table#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=156;md5=d8092ab2e07919f15991d9df3f8f6f9b"

DEPENDS = "npm-colors-native"

SRC_URI = "https://registry.npmjs.org/cli-table/-/cli-table-0.3.5.tgz"
SRC_URI[md5sum] = "b8baefb06b2dd1502e9288a9be48e7e8"
SRC_URI[sha256sum] = "8c2086ef331b47e412d78005bc4edf66266379faf7b0edeee9005b44208f1df1"

NPM_PKGNAME = "cli-table"

inherit npmhelper
inherit native
