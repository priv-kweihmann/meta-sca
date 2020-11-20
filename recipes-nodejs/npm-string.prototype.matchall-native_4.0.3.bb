SUMMARY = "NPM: string.prototype.matchall"
DESCRIPTION = "Spec-compliant polyfill for String.prototype.matchAll ESnext proposal."
HOMEPAGE = "https://github.com/ljharb/String.prototype.matchAll#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-has-symbols-native \
           npm-internal-slot-native \
           npm-regexp.prototype.flags-native \
           npm-side-channel-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.matchall/-/string.prototype.matchall-4.0.3.tgz"
SRC_URI[md5sum] = "30decc3c78814b736538643d73c21987"
SRC_URI[sha256sum] = "c4133a7821336adaa820a3a9cb2904287c5d525f8c75c594dd96ac9be5d19370"

NPM_PKGNAME = "string.prototype.matchall"

inherit npmhelper
inherit native
