SUMMARY = "NPM: unist-util-is"
DESCRIPTION = "unist utility to check if a node passes a test"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-is#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=129a18b8487c2727a4ae7d7e2ad7b231"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/unist-util-is/-/unist-util-is-4.0.3.tgz"
SRC_URI[md5sum] = "f885988e3a1be5720282079146ee516b"
SRC_URI[sha256sum] = "fa51ea12c30b2f760750090c53e4799cbfa39bbcde7787ab52377a4290c40fa9"

NPM_PKGNAME = "unist-util-is"

inherit npmhelper
inherit native
