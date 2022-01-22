SUMMARY = "NPM: node-fetch"
DESCRIPTION = "A light-weight module that brings Fetch API to node.js"
HOMEPAGE = "https://github.com/node-fetch/node-fetch"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b5d9c535657b1650d66a58538d99acc8"

DEPENDS = "npm-data-uri-to-buffer-native \
           npm-fetch-blob-native \
           npm-formdata-polyfill-native"

SRC_URI = "https://registry.npmjs.org/node-fetch/-/node-fetch-3.2.0.tgz"
SRC_URI[md5sum] = "6ac577586e5c8bd3cc9bf40da0b3fa43"
SRC_URI[sha256sum] = "d5fdf54a58aea249cd1ffcffdc33ac2191b7f9864db453ab534eea4ac2f448aa"

NPM_PKGNAME = "node-fetch"

inherit npmhelper
inherit native
