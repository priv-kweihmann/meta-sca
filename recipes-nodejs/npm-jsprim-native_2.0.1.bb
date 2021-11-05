SUMMARY = "NPM: jsprim"
DESCRIPTION = "utilities for primitive JavaScript types"
HOMEPAGE = "https://github.com/joyent/node-jsprim#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2"

DEPENDS = "npm-assert-plus-native \
           npm-extsprintf-native \
           npm-json-schema-native \
           npm-verror-native"

SRC_URI = "https://registry.npmjs.org/jsprim/-/jsprim-2.0.1.tgz"
SRC_URI[md5sum] = "0a9410b87af1c0c2067a91d3a5c710e0"
SRC_URI[sha256sum] = "22418a40ca228bdd4197ff4f53a1eb50c007c83407d7697149830c4e626d6e19"

NPM_PKGNAME = "jsprim"

inherit npmhelper
inherit native
