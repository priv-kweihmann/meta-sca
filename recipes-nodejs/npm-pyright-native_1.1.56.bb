SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.56.tgz"
SRC_URI[md5sum] = "650346ac0ca8f155ca8123d896ec573a"
SRC_URI[sha256sum] = "530610f5878c8c15884ed33a8642079630a89b4bf79f32456e967acdf5dd980d"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
