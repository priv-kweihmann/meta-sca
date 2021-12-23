SUMMARY = "NPM: unist-util-is"
DESCRIPTION = "unist utility to check if a node passes a test"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-is#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=129a18b8487c2727a4ae7d7e2ad7b231"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/unist-util-is/-/unist-util-is-5.1.1.tgz"
SRC_URI[md5sum] = "ad45d97cc008f36d8cfb7079bdec4e4a"
SRC_URI[sha256sum] = "cc36a0658f3702460eeab5809db9a62dc8551fce0b12369760a7bad3e0f92088"

NPM_PKGNAME = "unist-util-is"

inherit npmhelper
inherit native
