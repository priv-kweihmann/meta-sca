SUMMARY = "NPM: string.prototype.matchall"
DESCRIPTION = "Spec-compliant polyfill for String.prototype.matchAll"
HOMEPAGE = "https://github.com/es-shims/String.prototype.matchAll#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-get-intrinsic-native \
           npm-has-symbols-native \
           npm-internal-slot-native \
           npm-regexp.prototype.flags-native \
           npm-side-channel-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.matchall/-/string.prototype.matchall-4.0.5.tgz"
SRC_URI[md5sum] = "4073feb60aea229848fc2474126f7017"
SRC_URI[sha256sum] = "31afbcaea10a6010ab95a8a93035bc86edfe383b4599f178c1c6fcbbdc72c524"

NPM_PKGNAME = "string.prototype.matchall"

inherit npmhelper
inherit native
