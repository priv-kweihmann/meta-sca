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

SRC_URI = "https://registry.npmjs.org/got/-/got-11.8.0.tgz"
SRC_URI[md5sum] = "85d6939b714cdffe31b26d1ab11a4baf"
SRC_URI[sha256sum] = "7efd98eb08645908eb7032dc3b24856e69479eca16d7a814fb2a02fdd7ee9794"

NPM_PKGNAME = "got"

inherit npmhelper
inherit native
