SUMMARY = "NPM: readable-stream"
DESCRIPTION = "Streams3, a user-land copy of the stream library from Node.js"
HOMEPAGE = "https://github.com/nodejs/readable-stream#readme"

DEPENDS = "npm-inherits-native npm-string-decoder-native npm-util-deprecate-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a67a7926e54316d90c14f74f71080977"

SRC_URI = "https://registry.npmjs.org/readable-stream/-/readable-stream-3.6.0.tgz"
SRC_URI[md5sum] = "c877cb0a315f1cce3e4379faaa7cf4c7"
SRC_URI[sha256sum] = "530920d2dd9b9ce05500c3abb43fb6d8faf47e7be7b90e5893fc8f47949fc6bb"

NPM_PKGNAME = "readable-stream"

inherit npmhelper
inherit native
