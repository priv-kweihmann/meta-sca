SUMMARY = "NPM: is-weakref"
DESCRIPTION = "Is this value a JS WeakRef? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-weakref#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838b75dc6028daf3e04e57871b7ad3ed"

DEPENDS = "npm-call-bind-native"

SRC_URI = "https://registry.npmjs.org/is-weakref/-/is-weakref-1.0.1.tgz"
SRC_URI[md5sum] = "d88bf0e11e3d1d83d735117c69bba51b"
SRC_URI[sha256sum] = "be67f4831316466ff8cb8f6dd508e8ba6f0c4afb011e64aee428d6f2dd5e7c37"

NPM_PKGNAME = "is-weakref"

inherit npmhelper
inherit native
