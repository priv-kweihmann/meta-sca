SUMMARY = "NPM: got"
DESCRIPTION = "Human-friendly and powerful HTTP request library for Node.js"
HOMEPAGE = "https://github.com/sindresorhus/got#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-cacheable-lookup-native \
           npm-cacheable-request-native \
           npm-decompress-response-native \
           npm-get-stream-native \
           npm-http2-wrapper-native \
           npm-lowercase-keys-native \
           npm-p-cancelable-native \
           npm-responselike-native \
           npm-sindresorhus-is-native \
           npm-szmarczak-http-timer-native \
           npm-types-cacheable-request-native \
           npm-types-responselike-native"

SRC_URI = "https://registry.npmjs.org/got/-/got-11.1.4.tgz"
SRC_URI[md5sum] = "07d91d429d63409e9b77ee553877185c"
SRC_URI[sha256sum] = "f8a6a5543c759dff4e3e4355cec9a562987f3440ec88f276612e75d231f9988e"

NPM_PKGNAME = "got"

inherit npmhelper
inherit native
