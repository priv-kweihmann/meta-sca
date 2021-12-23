SUMMARY = "NPM: is-number-object"
DESCRIPTION = "Is this value a JS Number object? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-number-object#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-has-tostringtag-native"

SRC_URI = "https://registry.npmjs.org/is-number-object/-/is-number-object-1.0.6.tgz"
SRC_URI[md5sum] = "b9541523302c3dcfc0ed3f819496057c"
SRC_URI[sha256sum] = "0d6833a8c4f62895368ccb95fbd08ba8a6ff9124974aba410a58ad9104cc6683"

NPM_PKGNAME = "is-number-object"

inherit npmhelper
inherit native
