SUMMARY = "NPM: decamelize"
DESCRIPTION = "Convert a camelized string into a lowercased one with a custom separator: unicornRainbow → unicorn_rainbow"
HOMEPAGE = "https://github.com/sindresorhus/decamelize#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/decamelize/-/decamelize-5.0.0.tgz"
SRC_URI[md5sum] = "3fbf6fd01fc146f295399968a0b71955"
SRC_URI[sha256sum] = "fe7781063651a8bb7460161d9db096417b72d8dc8ba6971aa7fd1dcbb01f5b43"

NPM_PKGNAME = "decamelize"

inherit npmhelper
inherit native
