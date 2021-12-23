SUMMARY = "NPM: proto-props"
DESCRIPTION = "List of prototype properties for JavaScript types"
HOMEPAGE = "https://github.com/sindresorhus/proto-props#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/proto-props/-/proto-props-3.0.0.tgz"
SRC_URI[md5sum] = "f77bcd537621bb92abf3923b8565c3da"
SRC_URI[sha256sum] = "7170ef05bbb651c26b46ed515431be7274aec887170c1c13ad81a3dfa1eecb07"

NPM_PKGNAME = "proto-props"

inherit npmhelper
inherit native
