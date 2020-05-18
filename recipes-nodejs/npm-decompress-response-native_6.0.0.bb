SUMMARY = "NPM: decompress-response"
DESCRIPTION = "Decompress a HTTP response if needed"
HOMEPAGE = "https://github.com/sindresorhus/decompress-response#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-mimic-response-native"

SRC_URI = "https://registry.npmjs.org/decompress-response/-/decompress-response-6.0.0.tgz"
SRC_URI[md5sum] = "42341d878b515a101fc7a4d2e7d06bbb"
SRC_URI[sha256sum] = "d57e4c5b047bcea4c47cb4cabc14f360d3399389a14ef5a7ce524d181d2a3b4f"

NPM_PKGNAME = "decompress-response"

inherit npmhelper
inherit native
