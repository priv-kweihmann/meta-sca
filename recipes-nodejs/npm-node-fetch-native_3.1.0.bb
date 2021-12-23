SUMMARY = "NPM: node-fetch"
DESCRIPTION = "A light-weight module that brings Fetch API to node.js"
HOMEPAGE = "https://github.com/node-fetch/node-fetch"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b5d9c535657b1650d66a58538d99acc8"

DEPENDS = "npm-data-uri-to-buffer-native \
           npm-fetch-blob-native \
           npm-formdata-polyfill-native"

SRC_URI = "https://registry.npmjs.org/node-fetch/-/node-fetch-3.1.0.tgz"
SRC_URI[md5sum] = "e37018406706a810b3787e07eed1157f"
SRC_URI[sha256sum] = "9ddc77b1e3f425b90942010c90ebc580093dca1d5e555beeee7071412568f29e"

NPM_PKGNAME = "node-fetch"

inherit npmhelper
inherit native
