SUMMARY = "NPM: table"
DESCRIPTION = "Formats data into a string table."
HOMEPAGE = "https://github.com/gajus/table#readme"

DEPENDS = "npm-ajv-native npm-lodash-native npm-slice-ansi-native npm-string-width-native"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef26e159010da62c8f2df919be9c7034"

SRC_URI = "https://registry.npmjs.org/table/-/table-5.4.6.tgz"
SRC_URI[md5sum] = "e2ea5de365071848effb3531a04bd136"
SRC_URI[sha256sum] = "2c2810288f61c4f3df95502e6e5c6df183287a9d3de08a4562e710baed1212bf"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
