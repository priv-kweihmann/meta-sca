SUMMARY = "NPM: is-weakset"
DESCRIPTION = "Is this value a JS WeakSet? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-weakset#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4"

DEPENDS = "npm-call-bind-native \
           npm-get-intrinsic-native"

SRC_URI = "https://registry.npmjs.org/is-weakset/-/is-weakset-2.0.2.tgz"
SRC_URI[md5sum] = "6f486db93d34670c31129f7770a89002"
SRC_URI[sha256sum] = "12c2e53427dcf1e9e5a364e50633445f420e3cd6579a336b4af2d8c411b4ab9a"

NPM_PKGNAME = "is-weakset"

inherit npmhelper
inherit native
