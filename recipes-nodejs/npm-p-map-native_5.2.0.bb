SUMMARY = "NPM: p-map"
DESCRIPTION = "Map over promises concurrently"
HOMEPAGE = "https://github.com/sindresorhus/p-map#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-aggregate-error-native"

SRC_URI = "https://registry.npmjs.org/p-map/-/p-map-5.2.0.tgz"
SRC_URI[md5sum] = "41f75616c14d639f41cb7d8263a0a25c"
SRC_URI[sha256sum] = "52aaf621e56c2087ed29ad737d710c005dde74f307b244a02b38d6dbfb3e8642"

NPM_PKGNAME = "p-map"

inherit npmhelper
inherit native
