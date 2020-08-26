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

SRC_URI = "https://registry.npmjs.org/es-abstract/-/es-abstract-1.18.0-next.0.tgz"
SRC_URI[md5sum] = "347644490c2ae8ab469e812ff247db26"
SRC_URI[sha256sum] = "ca1bde39498b4d3958f25bb467c79e70907c21443708302f42db0f4b6b41e08d"

NPM_PKGNAME = "es-abstract"

inherit npmhelper
inherit native
