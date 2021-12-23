SUMMARY = "NPM: levn"
DESCRIPTION = "Light ECMAScript (JavaScript) Value Notation - human written, concise, typed, flexible"
HOMEPAGE = "https://github.com/gkz/levn"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7733af876e78a187f3a51e7c276ae883"

DEPENDS = "npm-prelude-ls-native \
           npm-type-check-native"

SRC_URI = "https://registry.npmjs.org/levn/-/levn-0.4.1.tgz"
SRC_URI[md5sum] = "5c93b156bd37c45e200b385932bd6d4d"
SRC_URI[sha256sum] = "1f4457d4df0f93521899c0fdee0263de0f243ecb90ea6bc6d744fadd132067d1"

NPM_PKGNAME = "levn"

inherit npmhelper
inherit native
