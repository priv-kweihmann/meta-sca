SUMMARY = "NPM: table"
DESCRIPTION = "Formats data into a string table."
HOMEPAGE = "https://github.com/gajus/table#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef26e159010da62c8f2df919be9c7034"

DEPENDS = "npm-ajv-native \
           npm-is-boolean-object-native \
           npm-is-number-object-native \
           npm-is-string-native \
           npm-lodash.clonedeep-native \
           npm-lodash.flatten-native \
           npm-lodash.truncate-native \
           npm-slice-ansi-native \
           npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/table/-/table-6.3.2.tgz"
SRC_URI[md5sum] = "6483075aba39859fbdbe8f51ff5d927d"
SRC_URI[sha256sum] = "4c1058d2b880755809a46658906c91859efbd04591de9504fbdf7a3fc8c6fc48"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
