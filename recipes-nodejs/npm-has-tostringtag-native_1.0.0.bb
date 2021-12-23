SUMMARY = "NPM: has-tostringtag"
DESCRIPTION = "Determine if the JS environment has `Symbol.toStringTag` support. Supports spec, or shams."
HOMEPAGE = "https://github.com/inspect-js/has-tostringtag#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a026b78b6909aa5e21d77709fb6b5156"

DEPENDS = "npm-has-symbols-native"

SRC_URI = "https://registry.npmjs.org/has-tostringtag/-/has-tostringtag-1.0.0.tgz"
SRC_URI[md5sum] = "25e5a30ea25da9a3e5cf67924512233a"
SRC_URI[sha256sum] = "d9c16499115e27d87e091a2f35c27b16ccf2a3a9b7274ccd6a4be374ca755213"

NPM_PKGNAME = "has-tostringtag"

inherit npmhelper
inherit native
