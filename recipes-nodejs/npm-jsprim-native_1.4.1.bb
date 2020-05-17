SUMMARY = "NPM: jsprim"
DESCRIPTION = "utilities for primitive JavaScript types"
HOMEPAGE = "https://github.com/joyent/node-jsprim#readme"

DEPENDS = "npm-assert-plus-native npm-extsprintf-native npm-json-schema-native npm-verror-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2"

SRC_URI = "https://registry.npmjs.org/jsprim/-/jsprim-1.4.1.tgz"
SRC_URI[md5sum] = "07fa4efad9f3688d08363e074a49e7df"
SRC_URI[sha256sum] = "1df307cc675650ee56c4a5f7c87860dd56d7e42f6350e715c1a92a280322ec46"

S = "${WORKDIR}/package"

NPM_PKGNAME = "jsprim"

inherit npmhelper
inherit native
