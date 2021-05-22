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

SRC_URI = "https://registry.npmjs.org/es-abstract/-/es-abstract-1.18.0.tgz"
SRC_URI[md5sum] = "48823ee716fa809134b4585c7362f998"
SRC_URI[sha256sum] = "fd385c31db8271a5772f2f38f2a543b3358786ffd21d718307885c90ad3093e6"

NPM_PKGNAME = "es-abstract"

inherit npmhelper
inherit native
