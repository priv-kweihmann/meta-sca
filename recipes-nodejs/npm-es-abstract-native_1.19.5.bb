SUMMARY = "NPM: es-abstract"
DESCRIPTION = "ECMAScript spec abstract operations."
HOMEPAGE = "https://github.com/ljharb/es-abstract#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8eddf3932f9ef22313648669213a2e4b"

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

SRC_URI = "https://registry.npmjs.org/es-abstract/-/es-abstract-1.19.5.tgz"
SRC_URI[md5sum] = "8c532954d19bc3f885bf2438d2f837e4"
SRC_URI[sha256sum] = "ea3fdbe5dba251109d20c4eaeb18d577f181e79f3042c4b712ec42d2d49e142e"

NPM_PKGNAME = "es-abstract"

inherit npmhelper
inherit native
