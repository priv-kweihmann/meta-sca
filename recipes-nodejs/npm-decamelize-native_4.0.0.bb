SUMMARY = "NPM: decamelize"
DESCRIPTION = "Convert a camelized string into a lowercased one with a custom separator: unicornRainbow → unicorn_rainbow"
HOMEPAGE = "https://github.com/sindresorhus/decamelize#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/decamelize/-/decamelize-4.0.0.tgz"
SRC_URI[md5sum] = "17113f86fb93e54ad64017cac7c80002"
SRC_URI[sha256sum] = "e4533ffad5fe578500b72f12bea96e226251ed6034162af1fb99bff93416f59f"

NPM_PKGNAME = "decamelize"

inherit npmhelper
inherit native
