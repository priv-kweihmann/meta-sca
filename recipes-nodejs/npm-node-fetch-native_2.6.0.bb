SUMMARY = "NPM: node-fetch"
DESCRIPTION = "A light-weight module that brings window.fetch to node.js"
HOMEPAGE = "https://github.com/bitinn/node-fetch"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=89fabe2fb10f72e48c2b3be506237d1e"

SRC_URI = "https://registry.npmjs.org/node-fetch/-/node-fetch-2.6.0.tgz"
SRC_URI[md5sum] = "83d0c8c9bf23ff19a5dd4a528b942676"
SRC_URI[sha256sum] = "76042fa91435241c7c5c8bb466e7958c286818efc447745a0d917135b9a6002e"

NPM_PKGNAME = "node-fetch"

inherit npmhelper
inherit native
