SUMMARY = "NPM: string.prototype.matchall"
DESCRIPTION = "Spec-compliant polyfill for String.prototype.matchAll ESnext proposal."
HOMEPAGE = "https://github.com/ljharb/String.prototype.matchAll#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-define-properties-native \
           npm-es-abstract-native \
           npm-has-symbols-native \
           npm-internal-slot-native \
           npm-regexp.prototype.flags-native \
           npm-side-channel-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.matchall/-/string.prototype.matchall-4.0.2.tgz"
SRC_URI[md5sum] = "683c99df8523958d3715d2213fdea983"
SRC_URI[sha256sum] = "6c8386c1387d451361e00d4bbfe964a6bfd6d578cad734be1691aca8373277e3"

NPM_PKGNAME = "string.prototype.matchall"

inherit npmhelper
inherit native
