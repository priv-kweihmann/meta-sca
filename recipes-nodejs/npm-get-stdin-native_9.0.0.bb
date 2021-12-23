SUMMARY = "NPM: get-stdin"
DESCRIPTION = "Get stdin as a string or buffer"
HOMEPAGE = "https://github.com/sindresorhus/get-stdin#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/get-stdin/-/get-stdin-9.0.0.tgz"
SRC_URI[md5sum] = "1cfcc22d9f88a19711473d5da7c117b3"
SRC_URI[sha256sum] = "a22b49bdacf6250ca155162efdc6a551b71e6d4ecfec3cf289f2f7097d1d1799"

NPM_PKGNAME = "get-stdin"

inherit npmhelper
inherit native
