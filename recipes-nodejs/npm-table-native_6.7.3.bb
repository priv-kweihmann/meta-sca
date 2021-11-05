SUMMARY = "NPM: table"
DESCRIPTION = "Formats data into a string table."
HOMEPAGE = "https://github.com/gajus/table#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef26e159010da62c8f2df919be9c7034"

DEPENDS = "npm-ajv-native \
           npm-lodash.truncate-native \
           npm-slice-ansi-native \
           npm-string-width-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/table/-/table-6.7.3.tgz"
SRC_URI[md5sum] = "a3a86ff26f4e5127c60b6133abb5b997"
SRC_URI[sha256sum] = "853b0d1f3bb4976d8b7f0652b0bb7af3cc0f41de2d0ebf4dc2a020a92d765f92"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
