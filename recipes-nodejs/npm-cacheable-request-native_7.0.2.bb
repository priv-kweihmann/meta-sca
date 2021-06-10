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

SRC_URI = "https://registry.npmjs.org/cacheable-request/-/cacheable-request-7.0.2.tgz"
SRC_URI[md5sum] = "e3673eb8953ea99e4a951534ce88188d"
SRC_URI[sha256sum] = "7a676329bd9d44259996da3a876355c296956e0c1cbd588d5a89fecea9f209a2"

NPM_PKGNAME = "cacheable-request"

inherit npmhelper
inherit native
