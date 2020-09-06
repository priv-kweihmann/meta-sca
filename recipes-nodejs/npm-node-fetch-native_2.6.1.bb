SUMMARY = "NPM: node-fetch"
DESCRIPTION = "A light-weight module that brings window.fetch to node.js"
HOMEPAGE = "https://github.com/bitinn/node-fetch"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=89fabe2fb10f72e48c2b3be506237d1e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-fetch/-/node-fetch-2.6.1.tgz"
SRC_URI[md5sum] = "a665c40026a9f1db5764c36204d115ef"
SRC_URI[sha256sum] = "d4ac14b166a432484c909ff6137822e059cada8a42c5f67bdca4b4dcdaf27783"

NPM_PKGNAME = "node-fetch"

inherit npmhelper
inherit native
