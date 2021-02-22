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

SRC_URI = "https://registry.npmjs.org/string.prototype.matchall/-/string.prototype.matchall-4.0.4.tgz"
SRC_URI[md5sum] = "f0d168a57c619408b681da7cb98ac20b"
SRC_URI[sha256sum] = "ee85515c4bc9bfe5e548ecedfebf5fe04dee6814ca90fdf6b0db735ce93aafe0"

NPM_PKGNAME = "string.prototype.matchall"

inherit npmhelper
inherit native
