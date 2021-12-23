SUMMARY = "NPM: jsprim"
DESCRIPTION = "utilities for primitive JavaScript types"
HOMEPAGE = "https://github.com/joyent/node-jsprim#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2"

DEPENDS = "npm-assert-plus-native \
           npm-extsprintf-native \
           npm-json-schema-native \
           npm-verror-native"

SRC_URI = "https://registry.npmjs.org/jsprim/-/jsprim-2.0.2.tgz"
SRC_URI[md5sum] = "fe4b297bc8eb8c0ee04175326bf11499"
SRC_URI[sha256sum] = "2a93fbcd16d5a723fd3de2c234616c46624fbec98512231f9b9c32e05efc217a"

NPM_PKGNAME = "jsprim"

inherit npmhelper
inherit native
