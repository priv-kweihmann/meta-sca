SUMMARY = "NPM: table"
DESCRIPTION = "Formats data into a string table."
HOMEPAGE = "https://github.com/gajus/table#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef26e159010da62c8f2df919be9c7034"

DEPENDS = "npm-ajv-native \
           npm-lodash.clonedeep-native \
           npm-lodash.flatten-native \
           npm-lodash.truncate-native \
           npm-slice-ansi-native \
           npm-string-width-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/table/-/table-6.6.0.tgz"
SRC_URI[md5sum] = "53f5e69165501baa79159b7fedd168df"
SRC_URI[sha256sum] = "c5cc8c68d87a55a50d717ad10bf09c8219775c4605ffac92c562f1fec45b5152"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
