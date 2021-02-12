SUMMARY = "NPM: decompress-response"
DESCRIPTION = "Decompress a HTTP response if needed"
HOMEPAGE = "https://github.com/sindresorhus/decompress-response#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-mimic-response-native"

SRC_URI = "https://registry.npmjs.org/decompress-response/-/decompress-response-7.0.0.tgz"
SRC_URI[md5sum] = "52ebf79718a3de2606ee72366a354c0d"
SRC_URI[sha256sum] = "a77ba5fe836694dca379df017607c3f843028622e93bd6723d9086f792ab1d23"

NPM_PKGNAME = "decompress-response"

inherit npmhelper
inherit native
