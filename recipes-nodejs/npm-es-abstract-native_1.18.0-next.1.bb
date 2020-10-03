SUMMARY = "NPM: es-abstract"
DESCRIPTION = "ECMAScript spec abstract operations."
HOMEPAGE = "https://github.com/ljharb/es-abstract#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b"

DEPENDS = "npm-es-to-primitive-native \
           npm-function-bind-native \
           npm-has-native \
           npm-has-symbols-native \
           npm-is-callable-native \
           npm-is-negative-zero-native \
           npm-is-regex-native \
           npm-object-inspect-native \
           npm-object-keys-native \
           npm-object.assign-native \
           npm-string.prototype.trimend-native \
           npm-string.prototype.trimstart-native"

SRC_URI = "https://registry.npmjs.org/es-abstract/-/es-abstract-1.18.0-next.1.tgz"
SRC_URI[md5sum] = "3b3b3985328ecd5d05717d50e8a3c7d1"
SRC_URI[sha256sum] = "73f9c545905fd911a921c5eba4858ceac5810be5666b5277981f8d5ae631fc7e"

NPM_PKGNAME = "es-abstract"

inherit npmhelper
inherit native
