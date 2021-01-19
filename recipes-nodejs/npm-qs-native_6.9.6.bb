SUMMARY = "NPM: qs"
DESCRIPTION = "A querystring parser that supports nesting and arrays, with a depth limit"
HOMEPAGE = "https://github.com/ljharb/qs"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b289135779dd930509ae81e6041690c0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/qs/-/qs-6.9.6.tgz"
SRC_URI[md5sum] = "6e100aa0f048e603b6743f5b68ded335"
SRC_URI[sha256sum] = "3ccd9b9aeed8fb20b4af0cd5bfa657b27522375b5f5942cd8fcf314ba9c0ec17"

NPM_PKGNAME = "qs"

inherit npmhelper
inherit native
