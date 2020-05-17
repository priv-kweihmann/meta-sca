SUMMARY = "NPM: get-stdin"
DESCRIPTION = "Get stdin as a string or buffer"
HOMEPAGE = "https://github.com/sindresorhus/get-stdin#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/get-stdin/-/get-stdin-8.0.0.tgz"
SRC_URI[md5sum] = "4d046d469cf530b254d8ac9227d43f52"
SRC_URI[sha256sum] = "550325d66daba9f958563774931430a7f55bd2aabc47703f2ca3102ed368440b"

NPM_PKGNAME = "get-stdin"

inherit npmhelper
inherit native
