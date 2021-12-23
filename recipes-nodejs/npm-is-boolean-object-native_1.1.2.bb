SUMMARY = "NPM: is-boolean-object"
DESCRIPTION = "Is this value a JS Boolean? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-boolean-object#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-has-tostringtag-native"

SRC_URI = "https://registry.npmjs.org/is-boolean-object/-/is-boolean-object-1.1.2.tgz"
SRC_URI[md5sum] = "6c467d1aa73d0b9e512c5e2255af0d49"
SRC_URI[sha256sum] = "c499b666c52f648be1445f37ce03c657a76abc543f5a71010572593164fcf2b3"

NPM_PKGNAME = "is-boolean-object"

inherit npmhelper
inherit native
