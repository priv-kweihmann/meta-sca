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

SRC_URI = "https://registry.npmjs.org/table/-/table-6.1.0.tgz"
SRC_URI[md5sum] = "660595a0cee796307f25b11342e606c5"
SRC_URI[sha256sum] = "5840d4bb48253f7662672175607a5f35ec59b6dd41b00d08c1cfad90c8968119"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
