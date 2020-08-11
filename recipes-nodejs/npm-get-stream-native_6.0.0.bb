SUMMARY = "NPM: get-stream"
DESCRIPTION = "Get a stream as a string, buffer, or array"
HOMEPAGE = "https://github.com/sindresorhus/get-stream#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/get-stream/-/get-stream-6.0.0.tgz"
SRC_URI[md5sum] = "11d01533d14ceb179a11a630bf74abc1"
SRC_URI[sha256sum] = "96c2aa9f777b013fd2f14c60686e76d224b7901e222e8c0fcc5c3235542f3d7d"

NPM_PKGNAME = "get-stream"

inherit npmhelper
inherit native
