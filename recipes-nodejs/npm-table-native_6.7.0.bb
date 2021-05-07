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

SRC_URI = "https://registry.npmjs.org/table/-/table-6.7.0.tgz"
SRC_URI[md5sum] = "9c0c9cb1c1b6e7780649d14924b50261"
SRC_URI[sha256sum] = "46efb071ce24da90f494774a354d95bb7ddeefef1860068ac49556808f7b2f8d"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
