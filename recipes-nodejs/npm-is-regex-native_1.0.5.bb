SUMMARY = "NPM: is-regex"
DESCRIPTION = "Is this value a JS regex? Works cross-realm/iframe, and despite ES6 @@toStringTag"
HOMEPAGE = "https://github.com/ljharb/is-regex"

DEPENDS = "npm-has-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

SRC_URI = "https://registry.npmjs.org/is-regex/-/is-regex-1.0.5.tgz"
SRC_URI[md5sum] = "7f3c0100192dc7fea190cffd4093f6d7"
SRC_URI[sha256sum] = "ee371a4361906505d368e8e6c5ca947a73f072f07cc7fc30c6cd577d34e5a55d"

NPM_PKGNAME = "is-regex"

inherit npmhelper
inherit native
