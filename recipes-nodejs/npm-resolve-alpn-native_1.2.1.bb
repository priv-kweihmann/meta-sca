SUMMARY = "NPM: resolve-alpn"
DESCRIPTION = "Detects the ALPN protocol"
HOMEPAGE = "https://github.com/szmarczak/resolve-alpn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3d086f7c83cdc609b9f5d6057d7c1e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/resolve-alpn/-/resolve-alpn-1.2.1.tgz"
SRC_URI[md5sum] = "2855816dc42bf60f21c489a8c9198321"
SRC_URI[sha256sum] = "fd974fb8383a55f0e23dd49f475ca164da9a8a66cec06afa255a21caa574a320"

NPM_PKGNAME = "resolve-alpn"

inherit npmhelper
inherit native
