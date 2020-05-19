SUMMARY = "NPM: prepend-http"
DESCRIPTION = "Prepend `https://` to humanized URLs like sindresorhus.com and localhost"
HOMEPAGE = "https://github.com/sindresorhus/prepend-http#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/prepend-http/-/prepend-http-3.0.1.tgz"
SRC_URI[md5sum] = "575a138df0f626b4bc4d6d34f32827c0"
SRC_URI[sha256sum] = "defc0c302e9b7849829642afd01b832daab52ac48c516e49ab9e0a23b16875d8"

NPM_PKGNAME = "prepend-http"

inherit npmhelper
inherit native
