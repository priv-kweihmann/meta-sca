SUMMARY = "NPM: node-fetch"
DESCRIPTION = "A light-weight module that brings Fetch API to node.js"
HOMEPAGE = "https://github.com/node-fetch/node-fetch"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b5d9c535657b1650d66a58538d99acc8"

DEPENDS = "npm-data-uri-to-buffer-native \
           npm-fetch-blob-native"

SRC_URI = "https://registry.npmjs.org/node-fetch/-/node-fetch-3.0.0.tgz"
SRC_URI[md5sum] = "590012a70dacef1cfed336cac4d3fd98"
SRC_URI[sha256sum] = "f5bceaaeaf12d09e883c122264b4eaefad0d50d456970bf9a929ca714342c69f"

NPM_PKGNAME = "node-fetch"

inherit npmhelper
inherit native
