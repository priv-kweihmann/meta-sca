SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.21.0.tgz"
SRC_URI[md5sum] = "a1d90024f9457d6b0773df7145383fcc"
SRC_URI[sha256sum] = "712296df3e8a433a4b3dccf65a3283e67106d4a805756e9b93fde206f01bd8e8"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
