SUMMARY = "NPM: unist-util-is"
DESCRIPTION = "unist utility to check if a node passes a test"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-is#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=129a18b8487c2727a4ae7d7e2ad7b231"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/unist-util-is/-/unist-util-is-4.0.4.tgz"
SRC_URI[md5sum] = "7c9dca3a53048030a867c312e7d8d6ea"
SRC_URI[sha256sum] = "499d513aed36d137456aea6ba9f41de4d269bb7072ba7cfe97765f193bb1002b"

NPM_PKGNAME = "unist-util-is"

inherit npmhelper
inherit native
