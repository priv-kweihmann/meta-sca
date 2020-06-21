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
           npm-is-regex-native \
           npm-object-inspect-native \
           npm-object-keys-native \
           npm-object.assign-native \
           npm-string.prototype.trimend-native \
           npm-string.prototype.trimstart-native"

SRC_URI = "https://registry.npmjs.org/es-abstract/-/es-abstract-1.17.6.tgz"
SRC_URI[md5sum] = "453b6383720204d8db9004a135c99e22"
SRC_URI[sha256sum] = "65b18890b449dc3f4382ff630b1ff86e2f99be2cf1d54aeec25f38a6acbdb07b"

NPM_PKGNAME = "es-abstract"

inherit npmhelper
inherit native
