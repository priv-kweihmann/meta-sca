SUMMARY = "NPM: is-path-inside"
DESCRIPTION = "Check if a path is inside another path"
HOMEPAGE = "https://github.com/sindresorhus/is-path-inside#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-path-inside/-/is-path-inside-3.0.3.tgz"
SRC_URI[md5sum] = "9bde252b2da232085600f1b84d7cf945"
SRC_URI[sha256sum] = "f691655fe6a20fe969179c7f7929d1bd62f5241c576fff06f97e5d2f80df3736"

NPM_PKGNAME = "is-path-inside"

inherit npmhelper
inherit native
