SUMMARY = "NPM: got"
DESCRIPTION = "Human-friendly and powerful HTTP request library for Node.js"
HOMEPAGE = "https://github.com/sindresorhus/got#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-cacheable-lookup-native \
           npm-cacheable-request-native \
           npm-decompress-response-native \
           npm-http2-wrapper-native \
           npm-lowercase-keys-native \
           npm-p-cancelable-native \
           npm-responselike-native \
           npm-sindresorhus-is-native \
           npm-szmarczak-http-timer-native \
           npm-types-cacheable-request-native \
           npm-types-responselike-native"

SRC_URI = "https://registry.npmjs.org/got/-/got-11.5.2.tgz"
SRC_URI[md5sum] = "e58d21a18c2ba0e97f79f428c105e664"
SRC_URI[sha256sum] = "38f595981c65c550ed4ec3c855354b3913598ea3c85f3f25f1adf55c97626d22"

NPM_PKGNAME = "got"

inherit npmhelper
inherit native
