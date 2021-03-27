SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-1.0.1.tgz"
SRC_URI[md5sum] = "84d62fcf0081daa162dc57b49d770ebb"
SRC_URI[sha256sum] = "cd418903b24048f7540ce330fc16086e555f466054ff3f8f7b95f54fd73f2642"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
