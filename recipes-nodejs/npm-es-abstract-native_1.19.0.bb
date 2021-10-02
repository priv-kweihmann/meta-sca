SUMMARY = "NPM: es-abstract"
DESCRIPTION = "ECMAScript spec abstract operations."
HOMEPAGE = "https://github.com/ljharb/es-abstract#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b"

DEPENDS = "npm-call-bind-native \
           npm-es-to-primitive-native \
           npm-function-bind-native \
           npm-get-intrinsic-native \
           npm-get-symbol-description-native \
           npm-has-native \
           npm-has-symbols-native \
           npm-internal-slot-native \
           npm-is-callable-native \
           npm-is-negative-zero-native \
           npm-is-regex-native \
           npm-is-shared-array-buffer-native \
           npm-is-string-native \
           npm-is-weakref-native \
           npm-object-inspect-native \
           npm-object-keys-native \
           npm-object.assign-native \
           npm-string.prototype.trimend-native \
           npm-string.prototype.trimstart-native \
           npm-unbox-primitive-native"

SRC_URI = "https://registry.npmjs.org/es-abstract/-/es-abstract-1.19.0.tgz"
SRC_URI[md5sum] = "14dc45a77d91c620ebc125f64083fd4f"
SRC_URI[sha256sum] = "63650783719f93c36e75cddfb8677ba31a20f453ad48984d5d0b75a7baba8ca8"

NPM_PKGNAME = "es-abstract"

inherit npmhelper
inherit native
