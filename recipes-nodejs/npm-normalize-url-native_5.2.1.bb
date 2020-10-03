SUMMARY = "NPM: normalize-url"
DESCRIPTION = "Normalize a URL"
HOMEPAGE = "https://github.com/sindresorhus/normalize-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-url/-/normalize-url-5.2.1.tgz"
SRC_URI[md5sum] = "d2b0aca7c28f4dac19ea5f8a3032598a"
SRC_URI[sha256sum] = "326a4b59aff67e89e1bd81d917cc84cf7b04ea40f1654ca9ae788ad691011e34"

NPM_PKGNAME = "normalize-url"

inherit npmhelper
inherit native
