SUMMARY = "NPM: unist-util-is"
DESCRIPTION = "unist utility to check if a node passes a test"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-is#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=129a18b8487c2727a4ae7d7e2ad7b231"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/unist-util-is/-/unist-util-is-5.1.0.tgz"
SRC_URI[md5sum] = "c21e867782e349d27000328dcc01195f"
SRC_URI[sha256sum] = "7962949d0be6af837ffa26e4010357cb2f49ff1666e5acda64fa781fef2868ea"

NPM_PKGNAME = "unist-util-is"

inherit npmhelper
inherit native
