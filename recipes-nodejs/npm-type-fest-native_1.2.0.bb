SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-1.2.0.tgz"
SRC_URI[md5sum] = "c26398b0c6761c08ec94615496ef0d1f"
SRC_URI[sha256sum] = "aff0bf0628816355d0bc4cc19686ee8cc62db86f64aed5be3e994f9299d06382"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
