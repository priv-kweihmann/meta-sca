SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-1.2.3.tgz"
SRC_URI[md5sum] = "483ed370955f0458c97466970110384f"
SRC_URI[sha256sum] = "596a5549234a405f924efb241846a93c96b6578da46c9346127fe43b9c5fe8e1"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
