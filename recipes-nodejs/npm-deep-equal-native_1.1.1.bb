SUMMARY = "NPM: deep-equal"
DESCRIPTION = "node's assert.deepEqual algorithm"
HOMEPAGE = "https://github.com/substack/node-deep-equal#readme"

DEPENDS = "npm-is-arguments-native npm-is-date-object-native npm-is-regex-native npm-object-is-native npm-object-keys-native npm-regexp.prototype.flags-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ec4e94fe7abda03e2e44a713b0908a07"

SRC_URI = "https://registry.npmjs.org/deep-equal/-/deep-equal-1.1.1.tgz"
SRC_URI[md5sum] = "d0fc6335d98238b52fdca80604fb08a5"
SRC_URI[sha256sum] = "b1c1a13716e3f4c34dc6473b3321f643fe680b6e45b9bc308e183a753d0b849a"

NPM_PKGNAME = "deep-equal"

inherit npmhelper
inherit native
