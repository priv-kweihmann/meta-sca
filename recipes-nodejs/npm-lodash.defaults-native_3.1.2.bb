SUMMARY = "NPM: lodash.defaults"
DESCRIPTION = "The modern build of lodash’s `_.defaults` as a module."
HOMEPAGE = "https://lodash.com/"

DEPENDS = "npm-lodash.assign-native npm-lodash.restparam-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f519f8cb155e30cece6b0e75aa6a3a53"

SRC_URI = "https://registry.npmjs.org/lodash.defaults/-/lodash.defaults-3.1.2.tgz"
SRC_URI[md5sum] = "d747310f8c46680c75711111231b2506"
SRC_URI[sha256sum] = "1d25fbcf448130f5271cdf05229213b7f16529a2fe323d5d07feffb62af6b42e"

NPM_PKGNAME = "lodash.defaults"

inherit npmhelper
inherit native
