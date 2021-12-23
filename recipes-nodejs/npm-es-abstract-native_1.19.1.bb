SUMMARY = "NPM: es-abstract"
DESCRIPTION = "ECMAScript spec abstract operations."
HOMEPAGE = "https://github.com/ljharb/es-abstract#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI = "https://registry.npmjs.org/es-abstract/-/es-abstract-1.19.1.tgz"
SRC_URI[md5sum] = "11444142629b2eb1c6cc47907ca74f1f"
SRC_URI[sha256sum] = "10fd94f8d892b32a91429bb7be44e1256d891c69467ae522e79bd6400f8946bc"

NPM_PKGNAME = "es-abstract"

inherit npmhelper
inherit native
