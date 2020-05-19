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

SRC_URI = "https://registry.npmjs.org/cacheable-request/-/cacheable-request-7.0.1.tgz"
SRC_URI[md5sum] = "eb85caae4556bd6b14a638902f25f802"
SRC_URI[sha256sum] = "db53d317585ef22917822650e78e0c53ca3bb4f88a8210019d4c0229ac9b72f6"

NPM_PKGNAME = "cacheable-request"

inherit npmhelper
inherit native
