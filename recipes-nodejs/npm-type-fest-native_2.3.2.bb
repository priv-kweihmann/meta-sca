SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.3.2.tgz"
SRC_URI[md5sum] = "a104ebea0aa6a96dee0a5a6923b30fd3"
SRC_URI[sha256sum] = "ea4deb343bd20259568fc7f4adf03fd079f2358d41c0e0498f9595ae47743e9e"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
