SUMMARY = "NPM: cacheable-request"
DESCRIPTION = "Wrap native HTTP requests with RFC compliant cache support"
HOMEPAGE = "https://github.com/lukechilds/cacheable-request#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9a2baa6947d5018096b83508bd94026e"

DEPENDS = "npm-clone-response-native \
           npm-get-stream-native \
           npm-http-cache-semantics-native \
           npm-keyv-native \
           npm-lowercase-keys-native \
           npm-normalize-url-native \
           npm-responselike-native"

SRC_URI = "https://registry.npmjs.org/cacheable-request/-/cacheable-request-6.1.0.tgz"
SRC_URI[md5sum] = "ca8604ff27ad3b1d6d92f79af798cfa4"
SRC_URI[sha256sum] = "0c1ae333caa412715ca477afdf1ec1980a7561fd11c4eb8901819f5919f55fcb"

NPM_PKGNAME = "cacheable-request"

inherit npmhelper
inherit native
