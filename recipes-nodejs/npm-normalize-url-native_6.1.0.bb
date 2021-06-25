SUMMARY = "NPM: normalize-url"
DESCRIPTION = "Normalize a URL"
HOMEPAGE = "https://github.com/sindresorhus/normalize-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-url/-/normalize-url-6.1.0.tgz"
SRC_URI[md5sum] = "6bab62b9651ccdfc2406397b75510bae"
SRC_URI[sha256sum] = "8f34b4d069baf8b69408ee70fe3e6a3baeacad2a40ff3c45cd54a56c863e3b0e"

NPM_PKGNAME = "normalize-url"

inherit npmhelper
inherit native
