SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.143.tgz"
SRC_URI[md5sum] = "d1c612337b3c2cf5cdc1c4c6464773d2"
SRC_URI[sha256sum] = "18c3a52f54e8cff8c706312d1b6602db096b601d9c53a41f8d6ead48e00a49cf"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
