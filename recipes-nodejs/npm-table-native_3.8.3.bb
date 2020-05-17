SUMMARY = "NPM: table"
DESCRIPTION = "Formats data into a string table."
HOMEPAGE = "https://github.com/gajus/table#readme"

DEPENDS = "npm-ajv-keywords-native npm-ajv-native npm-chalk-native npm-lodash-native npm-slice-ansi-native npm-string-width-native"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f40337ac3d6811b41ae15edf35c92e5e"

SRC_URI = "https://registry.npmjs.org/table/-/table-3.8.3.tgz"
SRC_URI[md5sum] = "caa5899fd31138fdbe11b2944fdf16e4"
SRC_URI[sha256sum] = "f19282cba5059dd103eef1cb5743eea52f45348a0b224b9f783a04a96cd563c0"

NPM_PKGNAME = "table"

inherit npmhelper
inherit native
