SUMMARY = "NPM: trim"
DESCRIPTION = "Trim string whitespace"
HOMEPAGE = "https://github.com/Trott/trim#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Readme.md;beginline=56;md5=b45d61f441ee044a3ad2d6cdac00aa86"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/trim/-/trim-1.0.1.tgz"
SRC_URI[md5sum] = "73acb87f2ff04d64feb27ac3809ae186"
SRC_URI[sha256sum] = "a1b10e95bc08d811b42fcd1539b79c19132a7b36703124c6faeebcca44adaf9b"

NPM_PKGNAME = "trim"

inherit npmhelper
inherit native
