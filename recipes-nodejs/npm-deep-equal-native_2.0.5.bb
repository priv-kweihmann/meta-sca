SUMMARY = "NPM: deep-equal"
DESCRIPTION = "node's assert.deepEqual algorithm"
HOMEPAGE = "https://github.com/inspect-js/node-deep-equal#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ec4e94fe7abda03e2e44a713b0908a07"

DEPENDS = "npm-call-bind-native \
           npm-es-get-iterator-native \
           npm-get-intrinsic-native \
           npm-is-arguments-native \
           npm-is-date-object-native \
           npm-is-regex-native \
           npm-isarray-native \
           npm-object-is-native \
           npm-object-keys-native \
           npm-object.assign-native \
           npm-regexp.prototype.flags-native \
           npm-side-channel-native \
           npm-which-boxed-primitive-native \
           npm-which-collection-native \
           npm-which-typed-array-native"

SRC_URI = "https://registry.npmjs.org/deep-equal/-/deep-equal-2.0.5.tgz"
SRC_URI[md5sum] = "77a7384a24078f3cb18857c540f18fa4"
SRC_URI[sha256sum] = "97e1530e5c37a5b1681b3b3d779cb074095abe215e3a67694ac00d61f1ccb265"

NPM_PKGNAME = "deep-equal"

inherit npmhelper
inherit native
