SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-1.1.3.tgz"
SRC_URI[md5sum] = "6acfb36676448b0968f0c410ef33dfdc"
SRC_URI[sha256sum] = "fe466e02ddcb1ae77f9ae684541c52610d1692e0b52e9fd26581b19dd750c70a"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
