SUMMARY = "NPM: is-string"
DESCRIPTION = "Is this value a JS String object or primitive? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/ljharb/is-string#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-has-tostringtag-native"

SRC_URI = "https://registry.npmjs.org/is-string/-/is-string-1.0.7.tgz"
SRC_URI[md5sum] = "a7cc7f159a13b20e5fa93015d6124705"
SRC_URI[sha256sum] = "cdfa3603dca66033b15c75fb807605d1fba9eca08bdcffe7ed47de1958d7cef4"

NPM_PKGNAME = "is-string"

inherit npmhelper
inherit native
