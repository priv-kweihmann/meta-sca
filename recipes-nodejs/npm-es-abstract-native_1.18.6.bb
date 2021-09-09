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
           npm-is-string-native \
           npm-object-inspect-native \
           npm-object-keys-native \
           npm-object.assign-native \
           npm-string.prototype.trimend-native \
           npm-string.prototype.trimstart-native \
           npm-unbox-primitive-native"

SRC_URI = "https://registry.npmjs.org/es-abstract/-/es-abstract-1.18.6.tgz"
SRC_URI[md5sum] = "6943c7806796f2c74c995c94fd1e5c19"
SRC_URI[sha256sum] = "750a4c720ed8f9c537572cff9e9cb46861936f106fe7322354049ee59134231a"

NPM_PKGNAME = "es-abstract"

inherit npmhelper
inherit native
