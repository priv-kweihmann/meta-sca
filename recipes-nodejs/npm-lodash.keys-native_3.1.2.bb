SUMMARY = "NPM: lodash.keys"
DESCRIPTION = "The modern build of lodash’s `_.keys` as a module."
HOMEPAGE = "https://lodash.com/"

DEPENDS = "npm-lodash.getnative-native npm-lodash.isarguments-native npm-lodash.isarray-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f519f8cb155e30cece6b0e75aa6a3a53"

SRC_URI = "https://registry.npmjs.org/lodash.keys/-/lodash.keys-3.1.2.tgz"
SRC_URI[md5sum] = "d2aa104b88db88e2c0f1ed627031ed03"
SRC_URI[sha256sum] = "3baf1f23fd7c9163bd41643a2994fb5e5c68161caa32741265903960a643293e"

NPM_PKGNAME = "lodash.keys"

inherit npmhelper
inherit native
