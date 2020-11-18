SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.19.0.tgz"
SRC_URI[md5sum] = "285fa478655141833a695f22dc4e617d"
SRC_URI[sha256sum] = "e7819f2e9b5a1b4030e5f6fabb562827986945a3e56d49f9d83e280019834d8f"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
