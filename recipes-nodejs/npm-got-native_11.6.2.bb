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

SRC_URI = "https://registry.npmjs.org/got/-/got-11.6.2.tgz"
SRC_URI[md5sum] = "378bf095d2faef2494fcd5711be5d0da"
SRC_URI[sha256sum] = "23a254c5d1f03d6c22aabff45e6b9b780c428893837c59596ca959a93de79ce5"

NPM_PKGNAME = "got"

inherit npmhelper
inherit native
