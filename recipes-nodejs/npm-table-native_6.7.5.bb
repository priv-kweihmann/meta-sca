SUMMARY = "NPM: table"
DESCRIPTION = "Formats data into a string table."
HOMEPAGE = "https://github.com/gajus/table#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef26e159010da62c8f2df919be9c7034"

DEPENDS = "npm-ajv-native \
           npm-lodash.truncate-native \
           npm-slice-ansi-native \
           npm-string-width-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/table/-/table-6.7.5.tgz"
SRC_URI[md5sum] = "8911bdc944d90e91d27edba118265f4e"
SRC_URI[sha256sum] = "e5efa47a7ced7bdd71c781cb17136d07597eaa757af14bb91caed00f2210eb28"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
