SUMMARY = "NPM: is-weakref"
DESCRIPTION = "Is this value a JS WeakRef? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-weakref#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838b75dc6028daf3e04e57871b7ad3ed"

DEPENDS = "npm-call-bind-native"

SRC_URI = "https://registry.npmjs.org/is-weakref/-/is-weakref-1.0.2.tgz"
SRC_URI[md5sum] = "f13ba3475e03ab6e1d3e4f4bcd681b51"
SRC_URI[sha256sum] = "97c4572be1529c60606e1269dabfb66d55ee86f8644bcafe23e136e513094505"

NPM_PKGNAME = "is-weakref"

inherit npmhelper
inherit native
