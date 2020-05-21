SUMMARY = "NPM: @types/cacheable-request"
DESCRIPTION = "TypeScript definitions for cacheable-request"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

DEPENDS = "npm-types-http-cache-semantics-native \
           npm-types-keyv-native \
           npm-types-node-native \
           npm-types-responselike-native"

SRC_URI = "https://registry.npmjs.org/@types/cacheable-request/-/cacheable-request-6.0.1.tgz"
SRC_URI[md5sum] = "8dfb2e6eec962424c6c7f4cdac21911f"
SRC_URI[sha256sum] = "c6305b72a9ecb8cc9ba3297ff3aa8555fb431aedf3c7bb14f3e862b756267e9b"

NPM_PKGNAME = "@types/cacheable-request"

inherit npmhelper
inherit native

S = "${WORKDIR}/cacheable-request"
