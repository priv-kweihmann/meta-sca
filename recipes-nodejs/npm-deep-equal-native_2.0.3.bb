SUMMARY = "NPM: deep-equal"
DESCRIPTION = "node's assert.deepEqual algorithm"
HOMEPAGE = "https://github.com/inspect-js/node-deep-equal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ec4e94fe7abda03e2e44a713b0908a07"

DEPENDS = "npm-es-abstract-native \
           npm-es-get-iterator-native \
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

SRC_URI = "https://registry.npmjs.org/deep-equal/-/deep-equal-2.0.3.tgz"
SRC_URI[md5sum] = "b4ae496b64820ff94ab192ad5267213c"
SRC_URI[sha256sum] = "57cd25ea938da1b734b0ebf3f6bcd4d29a85e6cc4fffe52a4301445e5898dd27"

NPM_PKGNAME = "deep-equal"

inherit npmhelper
inherit native
