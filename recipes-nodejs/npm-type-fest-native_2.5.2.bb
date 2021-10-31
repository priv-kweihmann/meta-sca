SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.5.2.tgz"
SRC_URI[md5sum] = "9e5e55aac18cde4b2285f9c501ef6cc2"
SRC_URI[sha256sum] = "ad6ebfb4adf76a8369df0d06bc5ac11c2ae2c584f2dbc03658f2582ca7bcdc18"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
