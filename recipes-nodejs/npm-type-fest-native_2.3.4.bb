SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.3.4.tgz"
SRC_URI[md5sum] = "216b3e36bbf3a97d0e1ae2d11fc63534"
SRC_URI[sha256sum] = "02f396899cc70b2e48d647ca1bcaebf39e37ddff5589c3953bc098c944f3e1a3"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
