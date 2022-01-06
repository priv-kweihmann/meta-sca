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

SRC_URI = "https://registry.npmjs.org/table/-/table-6.8.0.tgz"
SRC_URI[md5sum] = "815a0798ecd53c7fdbd37fc50426d759"
SRC_URI[sha256sum] = "cbab00b0600a51d0b07e26b801100e7194cf74bd403949a8e74393ae814a235d"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
