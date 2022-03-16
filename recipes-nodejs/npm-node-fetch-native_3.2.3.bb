SUMMARY = "NPM: node-fetch"
DESCRIPTION = "A light-weight module that brings Fetch API to node.js"
HOMEPAGE = "https://github.com/node-fetch/node-fetch"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b5d9c535657b1650d66a58538d99acc8"

DEPENDS = "npm-data-uri-to-buffer-native \
           npm-fetch-blob-native \
           npm-formdata-polyfill-native"

SRC_URI = "https://registry.npmjs.org/node-fetch/-/node-fetch-3.2.3.tgz"
SRC_URI[md5sum] = "de8e7f06b5867fb2cf4054310cceb6c3"
SRC_URI[sha256sum] = "09b507931cbebb46b9997f4bfeefae1470d77be70356907677ca5733823829ff"

NPM_PKGNAME = "node-fetch"

inherit npmhelper
inherit native
