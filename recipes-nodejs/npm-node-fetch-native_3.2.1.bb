SUMMARY = "NPM: node-fetch"
DESCRIPTION = "A light-weight module that brings Fetch API to node.js"
HOMEPAGE = "https://github.com/node-fetch/node-fetch"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b5d9c535657b1650d66a58538d99acc8"

DEPENDS = "npm-data-uri-to-buffer-native \
           npm-fetch-blob-native \
           npm-formdata-polyfill-native"

SRC_URI = "https://registry.npmjs.org/node-fetch/-/node-fetch-3.2.1.tgz"
SRC_URI[md5sum] = "46b1351d0d422ae7473a5eab9a8e0aaf"
SRC_URI[sha256sum] = "ba81eee1167d9c0803cb6e1ea7786f22a36a4cd18b802a105ce89bd3c50d7d80"

NPM_PKGNAME = "node-fetch"

inherit npmhelper
inherit native
