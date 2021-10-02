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

SRC_URI = "https://registry.npmjs.org/table/-/table-6.7.2.tgz"
SRC_URI[md5sum] = "593d51e096c3f8e090a0d1d2d69484b1"
SRC_URI[sha256sum] = "81b5d6f44a2b97de263926c8d83588b8fbfef0454dae41cd2dcb2617fa4daa11"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
