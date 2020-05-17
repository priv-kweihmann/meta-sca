SUMMARY = "NPM: @sindresorhus/is"
DESCRIPTION = "Type check values: `is.string('🦄') //=> true`"
HOMEPAGE = "https://github.com/sindresorhus/is#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@sindresorhus/is/-/is-0.14.0.tgz"
SRC_URI[md5sum] = "83c2fdaf0f10cc5836dbd4cb639fc830"
SRC_URI[sha256sum] = "eaa6120e4bc88c2ab5222599dc607f819b840e6f48adada16755f8354e9487ce"

NPM_PKGNAME = "@sindresorhus/is"

inherit npmhelper
inherit native
