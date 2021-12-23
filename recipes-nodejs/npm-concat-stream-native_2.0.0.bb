SUMMARY = "NPM: concat-stream"
DESCRIPTION = "writable stream that concatenates strings or binary data and calls a callback with the result"
HOMEPAGE = "https://github.com/maxogden/concat-stream#readme"

DEPENDS = "npm-buffer-from-native npm-inherits-native npm-readable-stream-native npm-typedarray-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8"

SRC_URI = "https://registry.npmjs.org/concat-stream/-/concat-stream-2.0.0.tgz"
SRC_URI[md5sum] = "a8f1a47755c6b3f767b2b8960d87070c"
SRC_URI[sha256sum] = "cc54997a7ce0221915ac863f5a684c0013563861b2eca63781ae1a8cc01e150c"

NPM_PKGNAME = "concat-stream"

inherit npmhelper
inherit native
