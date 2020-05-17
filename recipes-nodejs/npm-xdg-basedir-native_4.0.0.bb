SUMMARY = "NPM: xdg-basedir"
DESCRIPTION = "Get XDG Base Directory paths"
HOMEPAGE = "https://github.com/sindresorhus/xdg-basedir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/xdg-basedir/-/xdg-basedir-4.0.0.tgz"
SRC_URI[md5sum] = "6371dfd1789ea34e501399790364f1fc"
SRC_URI[sha256sum] = "fa7b5f902688906be46d9463cdb0a10f3465a8457b79c38856ac01c00ee743f9"

S = "${WORKDIR}/package"

NPM_PKGNAME = "xdg-basedir"

inherit npmhelper
inherit native
