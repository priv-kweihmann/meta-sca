SUMMARY = "NPM: split-transform-stream"
DESCRIPTION = "A combination of through2 and split with a straightforward interface."
DEPENDS = "npm-bubble-stream-error-native npm-event-stream-native npm-through2-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=35;md5=477dfa54ede28e2f361e7db05941d7a7"

SRC_URI = "https://registry.npmjs.org/split-transform-stream/-/split-transform-stream-0.1.1.tgz"
SRC_URI[md5sum] = "7ff1c216da2dd6fcc62a8be79e44ef22"
SRC_URI[sha256sum] = "a93edfb03d705f6d84800040b42d0938c3960b7c3291865ea86b2613dd9cea50"

NPM_PKGNAME = "split-transform-stream"

inherit npmhelper
inherit native
