SUMMARY = "NPM: get-symbol-description"
DESCRIPTION = "Gets the description of a Symbol. Handles `Symbol()` vs `Symbol('')` properly when possible."
HOMEPAGE = "https://github.com/inspect-js/get-symbol-description#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a026b78b6909aa5e21d77709fb6b5156"

DEPENDS = "npm-call-bind-native \
           npm-get-intrinsic-native"

SRC_URI = "https://registry.npmjs.org/get-symbol-description/-/get-symbol-description-1.0.0.tgz"
SRC_URI[md5sum] = "e14a4c666fa15e9f9173046700ead218"
SRC_URI[sha256sum] = "49ae7d22b2c841784307a90ec1fcd9c515c594cb3f56c8d66e94adc6a6426fbc"

NPM_PKGNAME = "get-symbol-description"

inherit npmhelper
inherit native
