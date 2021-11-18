SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=3e06173a93caec684ac1dbab40aec199"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.5.4.tgz"
SRC_URI[md5sum] = "85a0378c22ba88a7cb09e00850c590cb"
SRC_URI[sha256sum] = "20671d8fa1688a4e9630ec778f8e221e635b078387806b43d9e8dcad59682a43"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
