SUMMARY = "NPM: table"
DESCRIPTION = "Formats data into a string table."
HOMEPAGE = "https://github.com/gajus/table#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef26e159010da62c8f2df919be9c7034"

DEPENDS = "npm-ajv-native \
           npm-lodash-native \
           npm-slice-ansi-native \
           npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/table/-/table-6.0.4.tgz"
SRC_URI[md5sum] = "cdb4438b8f3863489537d55472a568f0"
SRC_URI[sha256sum] = "7173e601b67b0194b44f8040186fd10f00261dd18df6b6f01c5119b93aa7632c"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
