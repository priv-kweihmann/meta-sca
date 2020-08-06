SUMMARY = "NPM: is-regex"
DESCRIPTION = "Is this value a JS regex? Works cross-realm/iframe, and despite ES6 @@toStringTag"
HOMEPAGE = "https://github.com/ljharb/is-regex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = "npm-has-symbols-native"

SRC_URI = "https://registry.npmjs.org/is-regex/-/is-regex-1.1.1.tgz"
SRC_URI[md5sum] = "7ecb3fbdee17aab2a2e63a26b4b234eb"
SRC_URI[sha256sum] = "518bd53dc9cf4aa12e24961d2696849041486e69859df38566ca639ec591b869"

NPM_PKGNAME = "is-regex"

inherit npmhelper
inherit native
