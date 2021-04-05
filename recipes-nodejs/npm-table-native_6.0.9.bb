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

SRC_URI = "https://registry.npmjs.org/table/-/table-6.0.9.tgz"
SRC_URI[md5sum] = "c7bab74cebc6f18939a8937e0925d4f1"
SRC_URI[sha256sum] = "b5fd82a763a431da9a99cf9176b341ad3d3f9a8d78726f513589c6dfb87d7830"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
