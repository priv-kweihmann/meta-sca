SUMMARY = "NPM: @types/cacheable-request"
DESCRIPTION = "TypeScript definitions for cacheable-request"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/cacheable-request"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-http-cache-semantics-native \
           npm-types-keyv-native \
           npm-types-node-native \
           npm-types-responselike-native"

SRC_URI = "https://registry.npmjs.org/@types/cacheable-request/-/cacheable-request-6.0.2.tgz"
SRC_URI[md5sum] = "d75b9e89278e3846e4019f021a537d9d"
SRC_URI[sha256sum] = "5c68fad4f6d7ac70f3e88869faf9bfb1127fa2f7b159c767f7e3faf2d8f0a1be"

NPM_PKGNAME = "@types/cacheable-request"

inherit npmhelper
inherit native

S = "${WORKDIR}/cacheable-request"
