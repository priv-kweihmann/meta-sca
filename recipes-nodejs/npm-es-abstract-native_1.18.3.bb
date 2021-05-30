SUMMARY = "NPM: es-abstract"
DESCRIPTION = "ECMAScript spec abstract operations."
HOMEPAGE = "https://github.com/ljharb/es-abstract#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b"

DEPENDS = "npm-call-bind-native \
           npm-es-to-primitive-native \
           npm-function-bind-native \
           npm-get-intrinsic-native \
           npm-has-native \
           npm-has-symbols-native \
           npm-is-callable-native \
           npm-is-negative-zero-native \
           npm-is-regex-native \
           npm-is-string-native \
           npm-object-inspect-native \
           npm-object-keys-native \
           npm-object.assign-native \
           npm-string.prototype.trimend-native \
           npm-string.prototype.trimstart-native \
           npm-unbox-primitive-native"

SRC_URI = "https://registry.npmjs.org/es-abstract/-/es-abstract-1.18.3.tgz"
SRC_URI[md5sum] = "ba728e001d37652b3fc53b80e1804889"
SRC_URI[sha256sum] = "cdbe3c8ff359e3d0000297501cc2bd0a19972afca66ae398ef98ed5f12ee74f8"

NPM_PKGNAME = "es-abstract"

inherit npmhelper
inherit native
