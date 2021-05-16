SUMMARY = "NPM: table"
DESCRIPTION = "Formats data into a string table."
HOMEPAGE = "https://github.com/gajus/table#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef26e159010da62c8f2df919be9c7034"

DEPENDS = "npm-ajv-native \
           npm-lodash.clonedeep-native \
           npm-lodash.truncate-native \
           npm-slice-ansi-native \
           npm-string-width-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/table/-/table-6.7.1.tgz"
SRC_URI[md5sum] = "ae7017b90a7e3a55036fd7af0d47b1f0"
SRC_URI[sha256sum] = "2291ceb28cd001e684ff99c4d619407c2417f544a777c0b09b8d87120b4f4255"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
