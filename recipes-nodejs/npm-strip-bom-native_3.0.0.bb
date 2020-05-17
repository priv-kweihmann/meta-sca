SUMMARY = "NPM: strip-bom"
DESCRIPTION = "Strip UTF-8 byte order mark (BOM) from a string"
HOMEPAGE = "https://github.com/sindresorhus/strip-bom#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/strip-bom/-/strip-bom-3.0.0.tgz"
SRC_URI[md5sum] = "a2045f7f89506a0f8301822998d1daf7"
SRC_URI[sha256sum] = "48094c11a1f7faa867eb6919c09380232ce9b6d61fb3c43618ca6235b6013ee2"

NPM_PKGNAME = "strip-bom"

inherit npmhelper
inherit native
