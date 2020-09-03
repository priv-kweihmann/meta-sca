SUMMARY = "NPM: table"
DESCRIPTION = "Formats data into a string table."
HOMEPAGE = "https://github.com/gajus/table#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef26e159010da62c8f2df919be9c7034"

DEPENDS = "npm-ajv-native \
           npm-lodash-native \
           npm-slice-ansi-native \
           npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/table/-/table-6.0.1.tgz"
SRC_URI[md5sum] = "9c2a9b07e9ff32c6b40e20e7762bfcac"
SRC_URI[sha256sum] = "e73210238cf8b88bcad23f6fbfb2d2d8312ad26492b821c4ad7f396abbc29a4b"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
