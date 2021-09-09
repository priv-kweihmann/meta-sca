SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.2.0.tgz"
SRC_URI[md5sum] = "91069037cb6e516104ef58cf0788b859"
SRC_URI[sha256sum] = "b3f8449981f94f533bf087dbfede0e88caf87e247b4411af8ba26c0ba7d77832"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
