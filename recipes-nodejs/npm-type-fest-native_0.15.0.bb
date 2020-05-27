SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.15.0.tgz"
SRC_URI[md5sum] = "d0d7f063a7c4256f3534ae3c1d5fdb76"
SRC_URI[sha256sum] = "751bd83e475db5f6c7d774bab02a40ffce23bbc7058948b1ccc8202060c7acbf"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
