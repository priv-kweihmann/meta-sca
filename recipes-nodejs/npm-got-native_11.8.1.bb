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

SRC_URI = "https://registry.npmjs.org/got/-/got-11.8.1.tgz"
SRC_URI[md5sum] = "affc4ecf41e1b2edf60d278ebe0dde74"
SRC_URI[sha256sum] = "3e6701494ec4f5692d6ecebf8cead353b07bf54f8aaef989959f10f9644ec760"

NPM_PKGNAME = "got"

inherit npmhelper
inherit native
