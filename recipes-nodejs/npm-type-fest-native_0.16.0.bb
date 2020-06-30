SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.16.0.tgz"
SRC_URI[md5sum] = "a61aceb02c4fe4b65f953ce7c4703afc"
SRC_URI[sha256sum] = "a7561e625da87b378c5568073724f1980270c8835c07d84a3118a928636040d6"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
