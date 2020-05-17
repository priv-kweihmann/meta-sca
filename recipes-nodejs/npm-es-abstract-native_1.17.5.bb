SUMMARY = "NPM: es-abstract"
DESCRIPTION = "ECMAScript spec abstract operations."
HOMEPAGE = "https://github.com/ljharb/es-abstract#readme"

DEPENDS = "npm-es-to-primitive-native npm-function-bind-native npm-has-native npm-has-symbols-native npm-is-callable-native npm-is-regex-native npm-object-inspect-native npm-object-keys-native npm-object.assign-native npm-string.prototype.trimleft-native npm-string.prototype.trimright-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b"

SRC_URI = "https://registry.npmjs.org/es-abstract/-/es-abstract-1.17.5.tgz"
SRC_URI[md5sum] = "83a0a69c1d59ef78ba87863709c2232f"
SRC_URI[sha256sum] = "91c554f3fdd442fc11eb1ab8f718abb966fcfaf618941c336c78282caaefc8e6"

NPM_PKGNAME = "es-abstract"

inherit npmhelper
inherit native
