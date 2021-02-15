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
           npm-object-inspect-native \
           npm-object-keys-native \
           npm-object.assign-native \
           npm-string.prototype.trimend-native \
           npm-string.prototype.trimstart-native"

SRC_URI = "https://registry.npmjs.org/es-abstract/-/es-abstract-1.18.0-next.2.tgz"
SRC_URI[md5sum] = "b9e00b358d007c2fef025a19a511fd0a"
SRC_URI[sha256sum] = "2f517b6879733b5481330026392969ddaa2120a5d2eb99c81bb87443e0ef5b5f"

NPM_PKGNAME = "es-abstract"

inherit npmhelper
inherit native
