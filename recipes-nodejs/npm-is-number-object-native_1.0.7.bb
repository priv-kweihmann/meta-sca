SUMMARY = "NPM: is-number-object"
DESCRIPTION = "Is this value a JS Number object? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-number-object#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-has-tostringtag-native"

SRC_URI = "https://registry.npmjs.org/is-number-object/-/is-number-object-1.0.7.tgz"
SRC_URI[md5sum] = "01e99c61d94d3ac9cffd17b6a666c860"
SRC_URI[sha256sum] = "ab356b0a4c4dedc7ac45456826ec5caa14aa1051402516dc86f9bd75ba0a9b75"

NPM_PKGNAME = "is-number-object"

inherit npmhelper
inherit native
