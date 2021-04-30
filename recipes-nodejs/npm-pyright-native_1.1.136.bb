SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.136.tgz"
SRC_URI[md5sum] = "d46f4fef28aa9bfd557f33a115c5a39a"
SRC_URI[sha256sum] = "b69b8b02ac9815407d3d86148e375761a95ddf5f3589440ac2ceee47af956f8b"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
