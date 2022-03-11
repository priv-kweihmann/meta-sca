SUMMARY = "NPM: node-fetch"
DESCRIPTION = "A light-weight module that brings Fetch API to node.js"
HOMEPAGE = "https://github.com/node-fetch/node-fetch"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b5d9c535657b1650d66a58538d99acc8"

DEPENDS = "npm-data-uri-to-buffer-native \
           npm-fetch-blob-native \
           npm-formdata-polyfill-native"

SRC_URI = "https://registry.npmjs.org/node-fetch/-/node-fetch-3.2.2.tgz"
SRC_URI[md5sum] = "58b8c3e47cf336859a53d07f4b907e32"
SRC_URI[sha256sum] = "e90a87ef5767ebb4fb7e357f5776c142223afdf0139810e9312f749889360216"

NPM_PKGNAME = "node-fetch"

inherit npmhelper
inherit native
