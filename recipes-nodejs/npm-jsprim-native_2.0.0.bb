SUMMARY = "NPM: jsprim"
DESCRIPTION = "utilities for primitive JavaScript types"
HOMEPAGE = "https://github.com/joyent/node-jsprim#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2"

DEPENDS = "npm-assert-plus-native \
           npm-extsprintf-native \
           npm-json-schema-native \
           npm-verror-native"

SRC_URI = "https://registry.npmjs.org/jsprim/-/jsprim-2.0.0.tgz"
SRC_URI[md5sum] = "5ee92fbf3d75f06252c1a252e45081ca"
SRC_URI[sha256sum] = "f7ad90fe3dfe87174b09d3840a83d7b4d0e730bcb1422008ec6dc9aa88205cd8"

NPM_PKGNAME = "jsprim"

inherit npmhelper
inherit native
