SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.5.3.tgz"
SRC_URI[md5sum] = "93fc058a207ebbe0bdee1e0084249483"
SRC_URI[sha256sum] = "252551e11e88ba609fe6eb6c9d49b2f70e6f215ddb716eb0b6e490a4586e8c42"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
