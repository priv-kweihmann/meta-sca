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

SRC_URI = "https://registry.npmjs.org/got/-/got-11.7.0.tgz"
SRC_URI[md5sum] = "a0f4d210a65149d473c130471ad04163"
SRC_URI[sha256sum] = "bc7b8dc1ec6c3c8bf7ed9f9a76c194f0ba0d86a3ccb16a8b2bcca1e0a553e944"

NPM_PKGNAME = "got"

inherit npmhelper
inherit native
